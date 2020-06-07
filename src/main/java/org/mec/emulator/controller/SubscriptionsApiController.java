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
import org.mec.emulator.api.SubscriptionsApi;
import org.mec.emulator.model.InlineResponse200;
import org.mec.emulator.model.InlineResponse2001;
import org.mec.emulator.model.ZonalTrafficSubscription;
import org.mec.emulator.model.ZoneStatusSubscription;
import org.mec.emulator.service.SubscriptionsApiService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-06-05T02:11:06.510Z")

@Controller
public class SubscriptionsApiController implements SubscriptionsApi {

    private static final Logger log = LoggerFactory.getLogger(SubscriptionsApiController.class);

    @Autowired
    private SubscriptionsApiService subscriptionsApiService;

    public ResponseEntity<String> zonalTrafficSubDelById(
        @ApiParam(value = "Subscription ID", required = true) @PathVariable("subscriptionId") String subscriptionId) {
        return new ResponseEntity<>(subscriptionsApiService.zonalTrafficSubDelById(subscriptionId),
            HttpStatus.NO_CONTENT);
    }

    public ResponseEntity<InlineResponse200> zonalTrafficSubGet() {
        return new ResponseEntity<>(subscriptionsApiService.zonalTrafficSubGet(), HttpStatus.OK);
    }

    public ResponseEntity<Object> zonalTrafficSubGetById(
        @ApiParam(value = "Subscription ID", required = true) @PathVariable("subscriptionId") String subscriptionId) {
        return new ResponseEntity<>(subscriptionsApiService.zonalTrafficSubGetById(subscriptionId), HttpStatus.OK);
    }

    public ResponseEntity<Object> zonalTrafficSubPost(
        @ApiParam(value = "Zonal Traffic Subscription", required = true) @Valid @RequestBody
            ZonalTrafficSubscription zonalTrafficSubscription) {
        return new ResponseEntity<>(subscriptionsApiService.zonalTrafficSubPost(zonalTrafficSubscription),
            HttpStatus.CREATED);
    }

    public ResponseEntity<String> zoneStatusDelById(
        @ApiParam(value = "Subscription ID", required = true) @PathVariable("subscriptionId") String subscriptionId) {
        return new ResponseEntity<>(subscriptionsApiService.zoneStatusDelById(subscriptionId), HttpStatus.NO_CONTENT);
    }

    public ResponseEntity<InlineResponse2001> zoneStatusGet() {
        return new ResponseEntity<>(subscriptionsApiService.zoneStatusGet(), HttpStatus.OK);
    }

    public ResponseEntity<Object> zoneStatusGetById(
        @ApiParam(value = "Subscription ID", required = true) @PathVariable("subscriptionId") String subscriptionId) {
        return new ResponseEntity<>(subscriptionsApiService.zoneStatusGetById(subscriptionId), HttpStatus.OK);
    }

    public ResponseEntity<Object> zoneStatusPost(
        @ApiParam(value = "Zone Status Subscription", required = true) @Valid @RequestBody
            ZoneStatusSubscription zoneStatusSubscription) {
        return new ResponseEntity<>(subscriptionsApiService.zoneStatusPost(zoneStatusSubscription), HttpStatus.CREATED);

    }

}
