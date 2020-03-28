package org.mec.emulator;

import com.beust.jcommander.internal.Lists;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mec.cbb.util.log.Logger;
import com.mec.cbb.util.log.MecLogFactory;
import org.mec.emulator.gen.model.*;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;
import org.stringtemplate.v4.ST;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class EmulatorDataMgr implements ApplicationRunner {
    private static String name = null;
    private static final Logger LOGGER =
            MecLogFactory.getLogger(EmulatorDataMgr.class);

    private static final String USER_DATA_FILE_NAME = "./data/users/info.json";
    private static final String FACE_DATA_FILE_NAME = "./data/face_recognition/recognition.json";
    private static final String ZONAL_TRAFFIC_SUB_DATA_FILE_NAME = "./data" +
            "/subscriptions/ZonalTraffic/info.json";
    private static final String ZONE_STATUS_SUB_DATA_FILE_NAME = "./data" +
            "/subscriptions/ZoneStatus/info.json";
    private static final String ZONE_ACCESS_POINTS_DATA_FILE_NAME_PREFIX =
            "./data" +
                    "/zones/";
    private static final String ZONE_ACCESS_POINTS_DATA_FILE_NAME_SUFFIX =
            "/accessPoints/info.json";
    private static final String ZONE_DATA_FILE_NAME = "./data/zones/info.json";
    private static String userResourceURL = null;
    private static String zonalTrafficSubResourceURL = null;
    private static String zoneStatusSubResourceURL = null;
    private static String zoneResourceURL = null;
    private static Map<String, UserInfo> userIdToUserInfoMap = new HashMap<>();
    private static Map<String, ZonalTrafficSubscription> subIdToZonalTrafficSubMap = new HashMap<>();
    private static Map<String, ZoneStatusSubscription> subIdToZoneStatusSubMap = new HashMap<>();
    private static Map<String, ZoneInfo> zoneIdToZoneInfoMap = new HashMap<>();
    private static Map<String, Map<String, AccessPointInfo>> zoneIdToAccessPointIdToAccessPointInfoMap =
            new HashMap<>();
    private static Map<String, String> zoneIdToAccessPointResourceURL =
            new HashMap<>();

    public static UserList getUserListByZoneIdAndAccessPointId(String zoneId,
                                                               String accessPointId) {
        List<UserInfo> users = new ArrayList<>();
        userIdToUserInfoMap.values().forEach(userInfo -> {
            if (zoneId != null && !zoneId.equals(userInfo.getZoneId()) || accessPointId != null && !accessPointId.equals(userInfo.getAccessPointId())) {
                return;
            }
            users.add(userInfo);
        });
        return new UserList().user(users).resourceURL(userResourceURL);
    }

    public static UserInfo getUserInfoByUserId(String userId) {
        return userIdToUserInfoMap.get(userId);
    }

    public static void delZonalTrafficSubById(String subscriptionId) {
        subIdToZonalTrafficSubMap.remove(subscriptionId);
    }

    public static InlineResponse2006NotificationSubscriptionList getZonalTrafficSubs() {
        return new InlineResponse2006NotificationSubscriptionList().zonalTrafficSubscription(Lists.newArrayList(subIdToZonalTrafficSubMap.values())).resourceURL(zonalTrafficSubResourceURL);
    }

    public static ZonalTrafficSubscription getZonalTrafficSubById(String subscriptionId) {
        return subIdToZonalTrafficSubMap.get(subscriptionId);
    }

    public static void saveZonalTrafficSub(ZonalTrafficSubscription zonalTrafficSubscription) {
        subIdToZonalTrafficSubMap.put(zonalTrafficSubscription.getClientCorrelator(), zonalTrafficSubscription);
    }

    public static void delZoneStatusSubById(String subscriptionId) {
        subIdToZoneStatusSubMap.remove(subscriptionId);
    }

    public static InlineResponse2007NotificationSubscriptionList getZoneStatusSubs() {
        return new InlineResponse2007NotificationSubscriptionList().zoneStatusSubscription(Lists.newArrayList(subIdToZoneStatusSubMap.values())).resourceURL(zoneStatusSubResourceURL);
    }

    public static ZoneStatusSubscription getZoneStatusSubById(String subscriptionId) {
        return subIdToZoneStatusSubMap.get(subscriptionId);
    }

    public static void saveZoneStatusSub(ZoneStatusSubscription zoneStatusSubscription) {
        subIdToZoneStatusSubMap.put(zoneStatusSubscription.getClientCorrelator(), zoneStatusSubscription);
    }

    public static ZoneList getZoneList() {
        return new ZoneList().zone(Lists.newArrayList(zoneIdToZoneInfoMap.values())).resourceURL(zoneResourceURL);
    }

    public static ZoneInfo getZoneInfoById(String zoneId) {
        return zoneIdToZoneInfoMap.get(zoneId);
    }

    public static AccessPointList getAccessPointListByZoneIdAndInterestRealm(String zoneId,
                                                                             String interestRealm) {
        AccessPointList accessPointList =
                new AccessPointList().zoneId(zoneId).resourceURL(zoneIdToAccessPointResourceURL.get(zoneId));
        Map<String, AccessPointInfo> accessPointIdToAccessPointInfoMap =
                zoneIdToAccessPointIdToAccessPointInfoMap.get(zoneId);
        accessPointIdToAccessPointInfoMap.forEach((accessPointId,
                                                   AccessPointInfo) -> {
            if (interestRealm != null && !interestRealm.equals(AccessPointInfo.getInterestRealm())) {
                return;
            }
            accessPointList.addAccessPointItem(AccessPointInfo);
        });
        return accessPointList;
    }

    public static AccessPointInfo getAccessPointInfoByZoneIdAndAccessPointId(String zoneId,
                                                                             String accessPointId) {
        return zoneIdToAccessPointIdToAccessPointInfoMap.get(zoneId).get(accessPointId);
    }

    public static String getHealthCheck() {

        return "1";
    }

    public static String getFaceRecognitionInfo(MultipartFile file) {

        if(file.isEmpty()) {
            return "Images upload fail";
        }
        else {
            if(name==null) {
                return "Face information does not exist";
            }
            else {
                String recognitionResult = "{"  +
                        "  Face position:" +
                        "  {" +
                        "  bottom: 562," +
                        "  left: 419," +
                        "  right: 740," +
                        "  top: 241" +
                        " }," +
                        "  Name "+ name +
                        "}";
                return recognitionResult;

            }
        }
    }

    public static String getUploadInfo(MultipartFile file) {

        if(file.isEmpty()) {
            return "images upload fail";
        }
        else {
            String originalFilename = file.getOriginalFilename();
            name = originalFilename.substring(0, originalFilename.indexOf("."));
            String uploadValue = "{ Face number: 1, Result: upload success }";
            return uploadValue;
        }

    }

    public static String getVideoInfo(Body body) {

        return "Unable to connect to camera url";

    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        initData();
    }

    private void initData() throws IOException {

        // load user data
        UserList userListData =
                new ObjectMapper().readValue(new File(USER_DATA_FILE_NAME),
                        UserList.class);
        userListData.getUser().forEach(userInfo -> {
            userIdToUserInfoMap.put(userInfo.getAddress(), userInfo);
        });
        userResourceURL = userListData.getResourceURL();

        // load zonalTrafficSub data
        InlineResponse2006NotificationSubscriptionList zonalTrafficSubData =
                new ObjectMapper().readValue(new File(ZONAL_TRAFFIC_SUB_DATA_FILE_NAME),
                        InlineResponse2006NotificationSubscriptionList.class);
        zonalTrafficSubData.getZonalTrafficSubscription().forEach(zonalTrafficSubscription -> {
            subIdToZonalTrafficSubMap.put(zonalTrafficSubscription.getClientCorrelator(), zonalTrafficSubscription);
        });
        zonalTrafficSubResourceURL = zonalTrafficSubData.getResourceURL();

        // load zoneStatusSubscription data
        InlineResponse2007NotificationSubscriptionList zoneStatusSubscriptionData =
                new ObjectMapper().readValue(new File(ZONE_STATUS_SUB_DATA_FILE_NAME),
                        InlineResponse2007NotificationSubscriptionList.class);
        zoneStatusSubscriptionData.getZoneStatusSubscription().forEach(zoneStatusSubscription -> {
            subIdToZoneStatusSubMap.put(zoneStatusSubscription.getClientCorrelator(), zoneStatusSubscription);
        });
        zoneStatusSubResourceURL = zoneStatusSubscriptionData.getResourceURL();

        // load zone data
        ZoneList zoneList =
                new ObjectMapper().readValue(new File(ZONE_DATA_FILE_NAME),
                        ZoneList.class);
        for (ZoneInfo zoneInfo : zoneList.getZone()) {
            String zoneId = zoneInfo.getZoneId();
            zoneIdToZoneInfoMap.put(zoneId, zoneInfo);

            // load zone accessPoints data
            AccessPointList accessPointList =
                    new ObjectMapper().readValue(new File(ZONE_ACCESS_POINTS_DATA_FILE_NAME_PREFIX + zoneId + ZONE_ACCESS_POINTS_DATA_FILE_NAME_SUFFIX), AccessPointList.class);
            Map<String, AccessPointInfo> accessPointIdToAccessPointInfoMap =
                    new HashMap<>();
            accessPointList.getAccessPoint().forEach(accessPointInfo -> {
                accessPointIdToAccessPointInfoMap.put(accessPointInfo.getAccessPointId(), accessPointInfo);
            });
            zoneIdToAccessPointIdToAccessPointInfoMap.put(zoneId,
                    accessPointIdToAccessPointInfoMap);
            zoneIdToAccessPointResourceURL.put(zoneId,
                    accessPointList.getResourceURL());
        }
        zoneResourceURL = zoneList.getResourceURL();
        LOGGER.info("Succeed to load json data");
    }
}
