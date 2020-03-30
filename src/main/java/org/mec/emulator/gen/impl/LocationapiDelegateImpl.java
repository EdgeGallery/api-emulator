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

package org.mec.emulator.gen.impl;

import com.mec.cbb.util.log.Logger;
import com.mec.cbb.util.log.MecLogFactory;
import org.mec.emulator.EmulatorDataMgr;
import org.mec.emulator.gen.delegate.LocationapiDelegate;
import org.mec.emulator.gen.model.AccessPointInfo;
import org.mec.emulator.gen.model.AccessPointList;
import org.mec.emulator.gen.model.InlineResponse200;
import org.mec.emulator.gen.model.InlineResponse2001;
import org.mec.emulator.gen.model.InlineResponse2002;
import org.mec.emulator.gen.model.InlineResponse2003;
import org.mec.emulator.gen.model.InlineResponse2004;
import org.mec.emulator.gen.model.InlineResponse2005;
import org.mec.emulator.gen.model.InlineResponse2006;
import org.mec.emulator.gen.model.InlineResponse2006NotificationSubscriptionList;
import org.mec.emulator.gen.model.InlineResponse2007;
import org.mec.emulator.gen.model.InlineResponse2007NotificationSubscriptionList;
import org.mec.emulator.gen.model.InlineResponse201;
import org.mec.emulator.gen.model.InlineResponse2011;
import org.mec.emulator.gen.model.UserInfo;
import org.mec.emulator.gen.model.UserList;
import org.mec.emulator.gen.model.ZonalTrafficSubscription;
import org.mec.emulator.gen.model.ZoneInfo;
import org.mec.emulator.gen.model.ZoneList;
import org.mec.emulator.gen.model.ZoneStatusSubscription;
import org.springframework.stereotype.Component;

@Component
public class LocationapiDelegateImpl implements LocationapiDelegate {
    private static final Logger LOGGER = MecLogFactory.getLogger(LocationapiDelegateImpl.class);

    public InlineResponse2004 usersGet(String zoneId, String accessPointId) {
        LOGGER.info("Start to find userInfo list through zoneId: {} and accessPointId: {}", zoneId, accessPointId);
        UserList userList = EmulatorDataMgr.getUserListByZoneIdAndAccessPointId(zoneId, accessPointId);
        LOGGER.info("Succeed to find userInfo list through zoneId: {} and accessPointId: {}", zoneId, accessPointId);
        return new InlineResponse2004().userList(userList);
    }

    public InlineResponse2005 usersGetById(String userId) {
        LOGGER.info("Start to find userInfo through userId: {}", userId);
        UserInfo userInfo = EmulatorDataMgr.getUserInfoByUserId(userId);
        LOGGER.info("Succeed to find userInfo through userId: {}", userId);
        return new InlineResponse2005().userInfo(userInfo);
    }

    public String zonalTrafficSubDelById(String subscriptionId) {
        LOGGER.info("Start to delete zonal traffic subscription through subscriptionId: {}", subscriptionId);
        EmulatorDataMgr.delZonalTrafficSubById(subscriptionId);
        LOGGER.info("Succeed to delete zonal traffic subscription through subscriptionId: {}", subscriptionId);
        return subscriptionId;
    }

    public InlineResponse2006 zonalTrafficSubGet() {
        LOGGER.info("Start to find zonal traffic subscription list");
        InlineResponse2006NotificationSubscriptionList zonalTrafficSubs =
            EmulatorDataMgr.getZonalTrafficSubs();
        LOGGER.info("Succeed to find zonal traffic subscription list");
        return new InlineResponse2006().notificationSubscriptionList(zonalTrafficSubs);
    }

    public InlineResponse201 zonalTrafficSubGetById(String subscriptionId) {
        LOGGER.info("Start to find zonal traffic subscription through subscriptionId: {}", subscriptionId);
        ZonalTrafficSubscription zonalTrafficSubscription =
            EmulatorDataMgr.getZonalTrafficSubById(subscriptionId);
        LOGGER.info("Succeed to find zonal traffic subscription through subscriptionId: {}", subscriptionId);
        return new InlineResponse201().zonalTrafficSubscription(zonalTrafficSubscription);
    }

    public InlineResponse201 zonalTrafficSubPost(ZonalTrafficSubscription zonalTrafficSubscription) {
        LOGGER.info("Start to save zonal traffic subscription");
        EmulatorDataMgr.saveZonalTrafficSub(zonalTrafficSubscription);
        LOGGER.info("Succeed to save zonal traffic subscription");
        return new InlineResponse201().zonalTrafficSubscription(zonalTrafficSubscription);
    }

    public String zoneStatusDelById(String subscriptionId) {
        LOGGER.info("Start to delete zone status subscription through subscriptionId: {}", subscriptionId);
        EmulatorDataMgr.delZoneStatusSubById(subscriptionId);
        LOGGER.info("Succeed to delete zone status subscription through subscriptionId: {}", subscriptionId);
        return subscriptionId;
    }

    public InlineResponse2007 zoneStatusGet() {
        LOGGER.info("Start to find zone status subscription list");
        InlineResponse2007NotificationSubscriptionList zoneStatusSubs =
            EmulatorDataMgr.getZoneStatusSubs();
        LOGGER.info("Succeed to find zone status subscription list");
        return new InlineResponse2007().notificationSubscriptionList(zoneStatusSubs);
    }

    public InlineResponse2011 zoneStatusGetById(String subscriptionId) {
        LOGGER.info("Start to find zone status subscription through subscriptionId: {}", subscriptionId);
        ZoneStatusSubscription zoneStatusSubscription =
            EmulatorDataMgr.getZoneStatusSubById(subscriptionId);
        LOGGER.info("Succeed to find zone status subscription through subscriptionId: {}", subscriptionId);
        return new InlineResponse2011().zoneStatusSubscription(zoneStatusSubscription);
    }

    public InlineResponse2011 zoneStatusPost(ZoneStatusSubscription zoneStatusSubscription) {
        LOGGER.info("Start to save zone status subscription");
        EmulatorDataMgr.saveZoneStatusSub(zoneStatusSubscription);
        LOGGER.info("Succeed to save zone status subscription");
        return new InlineResponse2011().zoneStatusSubscription(zoneStatusSubscription);
    }

    public InlineResponse2002 zonesByIdGetAps(String zoneId,
                                              String interestRealm) {
        LOGGER.info("Start to find AccessPointList through zoneId: {} and  interestRealm", zoneId, interestRealm);
        AccessPointList accessPointList =
            EmulatorDataMgr.getAccessPointListByZoneIdAndInterestRealm(zoneId, interestRealm);
        LOGGER.info("Succeed to find AccessPointList through zoneId: {} and interestRealm", zoneId, interestRealm);
        return new InlineResponse2002().accessPointList(accessPointList);
    }

    public InlineResponse2003 zonesByIdGetApsById(String zoneId,
                                                  String accessPointId) {

        LOGGER.info("Start to find AccessPoint Info through zoneId: {} and accessPointId", zoneId, accessPointId);
        AccessPointInfo accessPointInfo =
            EmulatorDataMgr.getAccessPointInfoByZoneIdAndAccessPointId(zoneId, accessPointId);
        LOGGER.info("Succeed to find AccessPoint Info through zoneId: {} and interestRealm", zoneId, accessPointId);
        return new InlineResponse2003().accessPointInfo(accessPointInfo);
    }

    public InlineResponse200 zonesGet() {
        LOGGER.info("Start to find zone list");
        ZoneList zoneList =
            EmulatorDataMgr.getZoneList();
        LOGGER.info("Succeed to find zone list");
        return new InlineResponse200().zoneList(zoneList);
    }

    public InlineResponse2001 zonesGetById(String zoneId) {
        LOGGER.info("Start to find zone info through zoneId: {}", zoneId);
        ZoneInfo zoneInfo = EmulatorDataMgr.getZoneInfoById(zoneId);
        LOGGER.info("Succeed to find zone info through zoneId: {}", zoneId);
        return new InlineResponse2001().zoneInfo(zoneInfo);
    }
}