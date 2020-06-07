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

package org.mec.emulator.service;

import org.mec.emulator.model.InlineResponse200;
import org.mec.emulator.model.InlineResponse2001;
import org.mec.emulator.model.InlineResponse2001NotificationSubscriptionList;
import org.mec.emulator.model.InlineResponse200NotificationSubscriptionList;
import org.mec.emulator.model.ZonalTrafficSubscription;
import org.mec.emulator.model.ZoneStatusSubscription;
import org.mec.emulator.util.EmulatorDataMgr;
import org.springframework.stereotype.Component;

@Component
public class SubscriptionsApiService {

    public String zonalTrafficSubDelById(String subscriptionId) {
        EmulatorDataMgr.delZonalTrafficSubById(subscriptionId);
        return subscriptionId;
    }

    public InlineResponse200 zonalTrafficSubGet() {
        InlineResponse200NotificationSubscriptionList zonalTrafficSubs = EmulatorDataMgr.getZonalTrafficSubs();
        return new InlineResponse200().notificationSubscriptionList(zonalTrafficSubs);
    }

    public ZonalTrafficSubscription zonalTrafficSubGetById(String subscriptionId) {
        return EmulatorDataMgr.getZonalTrafficSubById(subscriptionId);
    }

    public ZonalTrafficSubscription zonalTrafficSubPost(ZonalTrafficSubscription zonalTrafficSubscription) {
        EmulatorDataMgr.saveZonalTrafficSub(zonalTrafficSubscription);
        return zonalTrafficSubscription;
    }

    public String zoneStatusDelById(String subscriptionId) {
        EmulatorDataMgr.delZoneStatusSubById(subscriptionId);
        return subscriptionId;
    }

    public InlineResponse2001 zoneStatusGet() {
        InlineResponse2001NotificationSubscriptionList zoneStatusSubs = EmulatorDataMgr.getZoneStatusSubs();
        return new InlineResponse2001().notificationSubscriptionList(zoneStatusSubs);
    }

    public ZoneStatusSubscription zoneStatusGetById(String subscriptionId) {
        return EmulatorDataMgr.getZoneStatusSubById(subscriptionId);
    }

    public ZoneStatusSubscription zoneStatusPost(ZoneStatusSubscription zoneStatusSubscription) {
        EmulatorDataMgr.saveZoneStatusSub(zoneStatusSubscription);
        return zoneStatusSubscription;
    }
}