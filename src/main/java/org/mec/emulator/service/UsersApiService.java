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

import org.mec.emulator.model.UserInfo;
import org.mec.emulator.model.UserList;
import org.mec.emulator.util.EmulatorDataMgr;
import org.springframework.stereotype.Component;

@Component
public class UsersApiService {

    public UserList usersGet(String zoneId, String accessPointId) {
        return EmulatorDataMgr.getUserListByZoneIdAndAccessPointId(zoneId, accessPointId);
    }

    public UserInfo usersGetById(String userId) {
        return EmulatorDataMgr.getUserInfoByUserId(userId);
    }
}