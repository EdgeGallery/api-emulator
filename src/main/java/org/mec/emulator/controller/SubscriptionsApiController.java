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

package org.mec.emulator.controller;

import io.swagger.annotations.ApiParam;
import java.util.UUID;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import org.mec.emulator.api.SubscriptionsApi;
import org.mec.emulator.model.InlineResponse200;
import org.mec.emulator.model.InlineResponse2001;
import org.mec.emulator.model.UserLocationSubscribe;
import org.mec.emulator.model.UserLocationSubscribeResult;
import org.mec.emulator.model.ZonalTrafficSubscription;
import org.mec.emulator.model.ZoneStatusSubscription;
import org.mec.emulator.service.SubscriptionsApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-06-05T02:11:06.510Z")

@Controller
public class SubscriptionsApiController implements SubscriptionsApi {

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

    public ResponseEntity<Object> subscribeLocation(
        @NotNull @ApiParam(value = "periodic subscription", required = true) @Valid @RequestBody
            UserLocationSubscribe requestData) {
        UserLocationSubscribeResult subResult = new UserLocationSubscribeResult();
        subResult.setSubscriptionId(UUID.randomUUID().toString());
        return new ResponseEntity<>(subResult, HttpStatus.CREATED);
    }

    public ResponseEntity<String> unsubscribeLocation(
        @NotNull @ApiParam(value = "subscription id", required = true) @Valid @PathVariable
            String subscriptionId) {
        return new ResponseEntity<>("{}", HttpStatus.NO_CONTENT);
    }
}
