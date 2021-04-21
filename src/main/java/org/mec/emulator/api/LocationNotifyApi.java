/*
 *   Copyright 2021 Huawei Technologies Co., Ltd.
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
import org.mec.emulator.model.UserLocationInfoNotify;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-06-05T02:11:06.510Z")

@Api(value = "location", description = "the location API")
@RequestMapping(value = "/location_notifications")
public interface LocationNotifyApi {

    @ApiOperation(value = "", nickname = "locationNotify", notes = "位置定位结果通知", response = Object.class,
        tags = {"location",})
    @ApiResponses(value = {
        @ApiResponse(code = 204, message = "Successful notify the location",
            response = Object.class)
    })
    @RequestMapping(value = "", produces = {"application/json"}, consumes = {"application/json"},
        method = RequestMethod.POST)
    ResponseEntity<String> notifyLocation(
        @NotNull @ApiParam(value = "location notify data", required = true) @Valid @RequestBody
            UserLocationInfoNotify notifyData);
}
