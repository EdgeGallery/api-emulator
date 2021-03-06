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

package org.mec.emulator.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-06-05T02:11:06.510Z")

@Api(value = "users", description = "the users API")
@RequestMapping(value = "/mep/location/v1")
public interface UsersApi {

    @ApiOperation(value = "", nickname = "usersGet", notes = "查询单个目标UE所在位置", response = Object.class,
        tags = {"users",})
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "Successful response to a query location of a user",
            response = Object.class)
    })
    @RequestMapping(value = "/users", produces = {"application/json"},
        method = RequestMethod.GET)
    ResponseEntity<Object> usersGet(
        @NotNull @ApiParam(value = "address", required = true) @Valid @RequestParam(value = "address", required = true)
            String address);

    @ApiOperation(value = "", nickname = "usersGet", notes = "获取指定地域、接入点的用户列表", response = Object.class,
        tags = {"users",})
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "Successful response to a query users within a zone request",
            response = Object.class)
    })
    @RequestMapping(value = "/user", produces = {"application/json"}, consumes = {"application/json"},
        method = RequestMethod.GET)
    ResponseEntity<Object> usersGet(
        @NotNull @ApiParam(value = "Zone ID", required = true) @Valid @RequestParam(value = "zoneId", required = true)
            String zoneId,
        @ApiParam(value = "Identifier of access point, reference \"definitions\" for string format") @Valid
        @RequestParam(value = "accessPointId", required = false) String accessPointId);

    @ApiOperation(value = "", nickname = "usersGetById", notes = "获取指定用户的详细信息", response = Object.class,
        tags = {"users",})
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "Successful response to a query users within a zone request",
            response = Object.class)
    })
    @RequestMapping(value = "/user/{userId}", produces = {"application/json"}, consumes = {"application/json"},
        method = RequestMethod.GET)
    ResponseEntity<Object> usersGetById(
        @ApiParam(value = "User ID", required = true) @PathVariable("userId") String userId);

}
