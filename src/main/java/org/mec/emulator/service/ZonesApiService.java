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

import org.mec.emulator.model.AccessPointInfo;
import org.mec.emulator.model.AccessPointList;
import org.mec.emulator.model.ZoneInfo;
import org.mec.emulator.model.ZoneList;
import org.mec.emulator.util.EmulatorDataMgr;
import org.springframework.stereotype.Component;

@Component
public class ZonesApiService {

    public AccessPointList zonesByIdGetAps(String zoneId, String interestRealm) {
        return EmulatorDataMgr.getAccessPointListByZoneIdAndInterestRealm(zoneId, interestRealm);
    }

    public AccessPointInfo zonesByIdGetApsById(String zoneId, String accessPointId) {
        return EmulatorDataMgr.getAccessPointInfoByZoneIdAndAccessPointId(zoneId, accessPointId);
    }

    public ZoneList zonesGet() {
        return EmulatorDataMgr.getZoneList();
    }

    public ZoneInfo zonesGetById(String zoneId) {
        return EmulatorDataMgr.getZoneInfoById(zoneId);
    }
}