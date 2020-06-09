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

package org.mec.emulator.controller;

import io.swagger.annotations.ApiParam;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import org.mec.emulator.api.UsersApi;
import org.mec.emulator.service.UsersApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-06-05T02:11:06.510Z")

@Controller
public class UsersApiController implements UsersApi {

    @Autowired
    private UsersApiService usersApiService;

    public ResponseEntity<Object> usersGet(
        @NotNull @ApiParam(value = "Zone ID", required = true) @Valid @RequestParam(value = "zoneId", required = true)
            String zoneId,
        @ApiParam(value = "Identifier of access point, reference \"definitions\" for string format") @Valid
        @RequestParam(value = "accessPointId", required = false) String accessPointId) {
        return new ResponseEntity<>(usersApiService.usersGet(zoneId, accessPointId), HttpStatus.OK);
    }

    public ResponseEntity<Object> usersGetById(
        @ApiParam(value = "User ID", required = true) @PathVariable("userId") String userId) {
        return new ResponseEntity<>(usersApiService.usersGetById(userId), HttpStatus.OK);
    }

}
