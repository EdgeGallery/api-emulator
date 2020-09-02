/*
 *   Copyright 2020 Huawei Technologies Co., Ltd.
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *
 */

package org.mec.emulator.util;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.mec.emulator.model.AccessPointInfo;
import org.mec.emulator.model.AccessPointList;
import org.mec.emulator.model.Body;
import org.mec.emulator.model.InlineResponse2001NotificationSubscriptionList;
import org.mec.emulator.model.InlineResponse200NotificationSubscriptionList;
import org.mec.emulator.model.UserInfo;
import org.mec.emulator.model.UserList;
import org.mec.emulator.model.ZonalTrafficSubscription;
import org.mec.emulator.model.ZoneInfo;
import org.mec.emulator.model.ZoneList;
import org.mec.emulator.model.ZoneStatusSubscription;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Component
public class EmulatorDataMgr implements ApplicationRunner {

    private static final Logger LOGGER = LoggerFactory.getLogger(EmulatorDataMgr.class);

    private static final String INFO_JSON = "info.json";

    private static final String HEATH_CHECK = "The emulator has started";

    private static String name = null;

    private static final String USER_DATA_FILE_NAME = "." + File.separator + "data" + File.separator + "users"
        + File.separator + INFO_JSON;

    private static final String ZONAL_TRAFFIC_SUB_DATA_FILE_NAME = "." + File.separator + "data" + "" + File.separator
        + "subscriptions" + File.separator + "ZonalTraffic" + File.separator + INFO_JSON;

    private static final String ZONE_STATUS_SUB_DATA_FILE_NAME = "." + File.separator + "data" + "" + File.separator
        + "subscriptions" + File.separator + "ZoneStatus" + File.separator + INFO_JSON;

    private static final String ZONE_ACCESS_POINTS_DATA_FILE_NAME_PREFIX = "." + File.separator + "data" + ""
        + File.separator + "zones" + File.separator + "";

    private static final String ZONE_ACCESS_POINTS_DATA_FILE_NAME_SUFFIX = "" + File.separator + "accessPoints"
        + File.separator + INFO_JSON;

    private static final String ZONE_DATA_FILE_NAME = "." + File.separator + "data" + File.separator + "zones"
        + File.separator + INFO_JSON;

    private static String userResourceURL = null;

    private static String zonalTrafficSubResourceURL = null;

    private static String zoneStatusSubResourceURL = null;

    private static String zoneResourceURL = null;

    private static Map<String, UserInfo> userIdToUserInfoMap = new HashMap<>();

    private static Map<String, ZonalTrafficSubscription> subIdToZonalTrafficSubMap = new HashMap<>();

    private static Map<String, ZoneStatusSubscription> subIdToZoneStatusSubMap = new HashMap<>();

    private static Map<String, ZoneInfo> zoneIdToZoneInfoMap = new HashMap<>();

    private static Map<String, Map<String, AccessPointInfo>> zoneIdToAccessPointIdToAccessPointInfoMap
        = new HashMap<>();

    private static Map<String, String> zoneIdToAccessPointResourceURL = new HashMap<>();

    public static UserList getUserListByZoneIdAndAccessPointId(String zoneId, String accessPointId) {
        List<UserInfo> users = new ArrayList<>();
        userIdToUserInfoMap.values().forEach(userInfo -> {
            if (zoneId != null && !zoneId.equals(userInfo.getZoneId()) || accessPointId != null && !accessPointId
                .equals(userInfo.getAccessPointId())) {
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

    public static InlineResponse200NotificationSubscriptionList getZonalTrafficSubs() {
        return new InlineResponse200NotificationSubscriptionList()
            .zonalTrafficSubscription(new ArrayList<>(subIdToZonalTrafficSubMap.values()))
            .resourceURL(zonalTrafficSubResourceURL);
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

    public static InlineResponse2001NotificationSubscriptionList getZoneStatusSubs() {
        return new InlineResponse2001NotificationSubscriptionList()
            .zoneStatusSubscription(new ArrayList<>(subIdToZoneStatusSubMap.values()))
            .resourceURL(zoneStatusSubResourceURL);
    }

    public static ZoneStatusSubscription getZoneStatusSubById(String subscriptionId) {
        return subIdToZoneStatusSubMap.get(subscriptionId);
    }

    public static void saveZoneStatusSub(ZoneStatusSubscription zoneStatusSubscription) {
        subIdToZoneStatusSubMap.put(zoneStatusSubscription.getClientCorrelator(), zoneStatusSubscription);
    }

    public static ZoneList getZoneList() {
        return new ZoneList().zone(new ArrayList<>(zoneIdToZoneInfoMap.values())).resourceURL(zoneResourceURL);
    }

    public static ZoneInfo getZoneInfoById(String zoneId) {
        return zoneIdToZoneInfoMap.get(zoneId);
    }

    public static AccessPointList getAccessPointListByZoneIdAndInterestRealm(String zoneId, String interestRealm) {
        AccessPointList accessPointList = new AccessPointList().zoneId(zoneId)
            .resourceURL(zoneIdToAccessPointResourceURL.get(zoneId));
        Map<String, AccessPointInfo> accessPointIdToAccessPointInfoMap = zoneIdToAccessPointIdToAccessPointInfoMap
            .get(zoneId);
        accessPointIdToAccessPointInfoMap.forEach((accessPointId, accessPointInfo) -> {
            if (interestRealm != null && !interestRealm.equals(accessPointInfo.getInterestRealm())) {
                return;
            }
            accessPointList.addAccessPointItem(accessPointInfo);
        });
        return accessPointList;
    }

    public static AccessPointInfo getAccessPointInfoByZoneIdAndAccessPointId(String zoneId, String accessPointId) {
        return zoneIdToAccessPointIdToAccessPointInfoMap.get(zoneId).get(accessPointId);
    }

    public static String getHealthCheck() {
        return HEATH_CHECK;
    }

    public static String getFaceRecognitionInfo(MultipartFile file) {

        if (file.isEmpty()) {
            return "Images upload fail";
        } else {
            if (name == null) {
                return "Face information does not exist";
            } else {
                return "{" + "  Face position:" + "  {" + "  bottom: 562," + "  left: 419,"
                    + "  right: 740," + "  top: 241" + " }," + "  Name " + name + "}";

            }
        }
    }

    public static String getUploadInfo(MultipartFile file) {

        if (file.isEmpty()) {
            return "images upload fail";
        } else {
            String originalFilename = file.getOriginalFilename();
            if (originalFilename == null) {
                return "file does not exist, please upload file";
            }
            name = originalFilename.substring(0, originalFilename.indexOf("."));
            return "{ Face number: 1, Result: upload success }";
        }

    }

    public static String getVideoInfo(Body body) {
        if (body.getUrl() !=null) {
            return "Unable to connect to camera url";
        }
        return "Unable to find url";

    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        initUserData();

        initZonalTrafficSubData();

        initZoneStatusSubscriptionData();

        initZoneData();

        LOGGER.info("Succeed to load json data");
    }

    private void initZoneData() throws IOException {
        ZoneList zoneList = new ObjectMapper().readValue(new File(ZONE_DATA_FILE_NAME), ZoneList.class);
        for (ZoneInfo zoneInfo : zoneList.getZone()) {
            String zoneId = zoneInfo.getZoneId();
            zoneIdToZoneInfoMap.put(zoneId, zoneInfo);

            // load zone accessPoints data
            AccessPointList accessPointList = new ObjectMapper().readValue(
                new File(ZONE_ACCESS_POINTS_DATA_FILE_NAME_PREFIX + zoneId + ZONE_ACCESS_POINTS_DATA_FILE_NAME_SUFFIX),
                AccessPointList.class);
            Map<String, AccessPointInfo> accessPointIdToAccessPointInfoMap = new HashMap<>();
            accessPointList.getAccessPoint().forEach(accessPointInfo ->
                accessPointIdToAccessPointInfoMap.put(accessPointInfo.getAccessPointId(), accessPointInfo)
            );
            zoneIdToAccessPointIdToAccessPointInfoMap.put(zoneId, accessPointIdToAccessPointInfoMap);
            zoneIdToAccessPointResourceURL.put(zoneId, accessPointList.getResourceURL());
        }
        zoneResourceURL = zoneList.getResourceURL();
    }

    private void initZoneStatusSubscriptionData() throws IOException {
        InlineResponse2001NotificationSubscriptionList zoneStatusSubscriptionData = new ObjectMapper()
            .readValue(new File(ZONE_STATUS_SUB_DATA_FILE_NAME), InlineResponse2001NotificationSubscriptionList.class);
        zoneStatusSubscriptionData.getZoneStatusSubscription().forEach(zoneStatusSubscription ->
            subIdToZoneStatusSubMap.put(zoneStatusSubscription.getClientCorrelator(), zoneStatusSubscription)
        );
        zoneStatusSubResourceURL = zoneStatusSubscriptionData.getResourceURL();
    }

    private void initZonalTrafficSubData() throws IOException {
        InlineResponse200NotificationSubscriptionList zonalTrafficSubData = new ObjectMapper()
            .readValue(new File(ZONAL_TRAFFIC_SUB_DATA_FILE_NAME), InlineResponse200NotificationSubscriptionList.class);
        zonalTrafficSubData.getZonalTrafficSubscription().forEach(zonalTrafficSubscription ->
            subIdToZonalTrafficSubMap.put(zonalTrafficSubscription.getClientCorrelator(), zonalTrafficSubscription)
        );
        zonalTrafficSubResourceURL = zonalTrafficSubData.getResourceURL();
    }

    private void initUserData() throws IOException {
        UserList userListData = new ObjectMapper().readValue(new File(USER_DATA_FILE_NAME), UserList.class);
        userListData.getUser().forEach(userInfo ->
            userIdToUserInfoMap.put(userInfo.getAddress(), userInfo)
        );
        userResourceURL = userListData.getResourceURL();
    }
}
