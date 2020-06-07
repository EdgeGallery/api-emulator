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
import java.io.IOException;
import javax.validation.Valid;
import org.mec.emulator.api.ZonesApi;
import org.mec.emulator.service.ZonesApiService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-06-05T02:11:06.510Z")

@Controller
public class ZonesApiController implements ZonesApi {

    private static final Logger log = LoggerFactory.getLogger(ZonesApiController.class);

    @Autowired
    private ZonesApiService zonesApiService;

    public ResponseEntity<Object> zonesByIdGetAps(
        @ApiParam(value = "Zone ID", required = true) @PathVariable("zoneId") String zoneId,
        @ApiParam(value = "Interest realm of access point (e.g. geographical area, a type of industry etc.).") @Valid
        @RequestParam(value = "interestRealm", required = false) String interestRealm) {
        return new ResponseEntity<>(zonesApiService.zonesByIdGetAps(zoneId, interestRealm), HttpStatus.OK);
    }

    public ResponseEntity<Object> zonesByIdGetApsById(
        @ApiParam(value = "Zone ID", required = true) @PathVariable("zoneId") String zoneId,
        @ApiParam(value = "Access Point ID", required = true) @PathVariable("accessPointId") String accessPointId) {
        return new ResponseEntity<>(zonesApiService.zonesByIdGetApsById(zoneId, accessPointId), HttpStatus.OK);
    }

    public ResponseEntity<Object> zonesGet() {
        return new ResponseEntity<>(zonesApiService.zonesGet(), HttpStatus.OK);
    }

    public ResponseEntity<Object> zonesGetById(
        @ApiParam(value = "Zone ID", required = true) @PathVariable("zoneId") String zoneId) {
        return new ResponseEntity<>(zonesApiService.zonesGetById(zoneId), HttpStatus.OK);
    }

}
