/*
 *   Copyright 2020-2021 Huawei Technologies Co., Ltd.
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

import java.util.Random;
import org.mec.emulator.model.UserInfo;
import org.mec.emulator.model.UserList;
import org.mec.emulator.model.UserLocation;
import org.mec.emulator.model.UserLocationInfo;
import org.mec.emulator.util.EmulatorDataMgr;
import org.springframework.stereotype.Component;

@Component
public class UsersApiService {
    private static final Random RANDOM_INSTANCE = new Random();

    public UserLocationInfo usersGet(String address) {

        UserLocation userLoc = new UserLocation();
        userLoc.setMapId(5);
        userLoc.setX(RANDOM_INSTANCE.nextInt(1800));
        userLoc.setY(RANDOM_INSTANCE.nextInt(1000));
        userLoc.setZ(RANDOM_INSTANCE.nextInt(100));

        UserLocationInfo userLocationInfo = new UserLocationInfo();
        userLocationInfo.setUeId(address);
        userLocationInfo.setLocationInfo(userLoc);
        userLocationInfo.setTimestamp(System.currentTimeMillis());

        return userLocationInfo;
    }

    public UserList usersGet(String zoneId, String accessPointId) {
        return EmulatorDataMgr.getUserListByZoneIdAndAccessPointId(zoneId, accessPointId);
    }

    public UserInfo usersGetById(String userId) {
        return EmulatorDataMgr.getUserInfoByUserId(userId);
    }
}