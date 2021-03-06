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
import org.mec.emulator.model.InlineResponse200;
import org.mec.emulator.model.InlineResponse2001;
import org.mec.emulator.model.UserLocationSubscribe;
import org.mec.emulator.model.ZonalTrafficSubscription;
import org.mec.emulator.model.ZoneStatusSubscription;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-06-05T02:11:06.510Z")

@Api(value = "subscriptions", description = "the subscriptions API")
@RequestMapping(value = "/mep/location/v1")
public interface SubscriptionsApi {

    @ApiOperation(value = "", nickname = "zonalTrafficSubDelById", notes = "删除指定的跟踪订阅", response = String.class,
        tags = {"subscriptions",})
    @ApiResponses(value = {
        @ApiResponse(code = 204, message = "No content", response = String.class)
    })
    @RequestMapping(value = "/subscriptions/zonalTraffic/{subscriptionId}", produces = {"application/json"},
        consumes = {"application/json"}, method = RequestMethod.DELETE)
    ResponseEntity<String> zonalTrafficSubDelById(
        @ApiParam(value = "Subscription ID", required = true) @PathVariable("subscriptionId") String subscriptionId);

    @ApiOperation(value = "", nickname = "zonalTrafficSubGet", notes = "检索所有活动订阅（获取区域跟踪更改通知的订阅）。",
        response = InlineResponse200.class, tags = {"subscriptions",})
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "Response to retrieve zonal traffic subscriptions",
            response = InlineResponse200.class)
    })
    @RequestMapping(value = "/subscriptions/zonalTraffic", produces = {"application/json"},
        consumes = {"application/json"}, method = RequestMethod.GET)
    ResponseEntity<InlineResponse200> zonalTrafficSubGet();

    @ApiOperation(value = "", nickname = "zonalTrafficSubGetById", notes = "查询指定跟踪订阅的详情", response = Object.class,
        tags = {"subscriptions",})
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "Response to retrieve individual zonal traffic subscription",
            response = Object.class)
    })
    @RequestMapping(value = "/subscriptions/zonalTraffic/{subscriptionId}", produces = {"application/json"},
        consumes = {"application/json"}, method = RequestMethod.GET)
    ResponseEntity<Object> zonalTrafficSubGetById(
        @ApiParam(value = "Subscription ID", required = true) @PathVariable("subscriptionId") String subscriptionId);

    @ApiOperation(value = "", nickname = "zonalTrafficSubPost", notes = "订阅事件，订阅区域跟踪更改的事件", response = Object.class,
        tags = {"subscriptions",})
    @ApiResponses(value = {
        @ApiResponse(code = 201, message = "Response to create new zonal traffic subscription", response = Object.class)
    })
    @RequestMapping(value = "/subscriptions/zonalTraffic", produces = {"application/json"},
        consumes = {"application/json"}, method = RequestMethod.POST)
    ResponseEntity<Object> zonalTrafficSubPost(
        @ApiParam(value = "Zonal Traffic Subscription", required = true) @Valid @RequestBody
            ZonalTrafficSubscription zonalTrafficSubscription);

    @ApiOperation(value = "", nickname = "zoneStatusDelById", notes = "删除指定的区域状态订阅", response = String.class,
        tags = {"subscriptions",})
    @ApiResponses(value = {
        @ApiResponse(code = 204, message = "No content", response = String.class)
    })
    @RequestMapping(value = "/subscriptions/zoneStatus/{subscriptionId}", produces = {"application/json"},
        consumes = {"application/json"}, method = RequestMethod.DELETE)
    ResponseEntity<String> zoneStatusDelById(
        @ApiParam(value = "Subscription ID", required = true) @PathVariable("subscriptionId") String subscriptionId);

    @ApiOperation(value = "", nickname = "zoneStatusGet", notes = "获取所有区域状态订阅", response = InlineResponse2001.class,
        tags = {"subscriptions",})
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "Response to retrieve zone status subscriptions",
            response = InlineResponse2001.class)
    })
    @RequestMapping(value = "/subscriptions/zonalStatus", produces = {"application/json"},
        consumes = {"application/json"}, method = RequestMethod.GET)
    ResponseEntity<InlineResponse2001> zoneStatusGet();

    @ApiOperation(value = "", nickname = "zoneStatusGetById", notes = "获取指定的区域状态订阅详情", response = Object.class,
        tags = {"subscriptions",})
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "Response to retrieve individual zone status subscription",
            response = Object.class)
    })
    @RequestMapping(value = "/subscriptions/zoneStatus/{subscriptionId}", produces = {"application/json"},
        consumes = {"application/json"}, method = RequestMethod.GET)
    ResponseEntity<Object> zoneStatusGetById(
        @ApiParam(value = "Subscription ID", required = true) @PathVariable("subscriptionId") String subscriptionId);

    @ApiOperation(value = "", nickname = "zoneStatusPost", notes = "订阅事件，区域状态改变的事件", response = Object.class,
        tags = {"subscriptions",})
    @ApiResponses(value = {
        @ApiResponse(code = 201, message = "Response to create new zone status subscription", response = Object.class)
    })
    @RequestMapping(value = "/subscriptions/zonalStatus", produces = {"application/json"},
        consumes = {"application/json"}, method = RequestMethod.POST)
    ResponseEntity<Object> zoneStatusPost(
        @ApiParam(value = "Zone Status Subscription", required = true) @Valid @RequestBody
            ZoneStatusSubscription zoneStatusSubscription);

    @ApiOperation(value = "", nickname = "subscribe", notes = "发起订阅", response = Object.class,
        tags = {"users",})
    @ApiResponses(value = {
        @ApiResponse(code = 201, message = "Successful submit subscribe",
            response = Object.class)
    })
    @RequestMapping(value = "/subscriptions/periodic", produces = {"application/json"}, consumes = {"application/json"},
        method = RequestMethod.POST)
    ResponseEntity<Object> subscribeLocation(
        @NotNull @ApiParam(value = "periodic subscription", required = true) @Valid @RequestBody
            UserLocationSubscribe requestData);

    @ApiOperation(value = "", nickname = "unsubscribe", notes = "取消订阅", response = Object.class,
        tags = {"users",})
    @ApiResponses(value = {
        @ApiResponse(code = 204, message = "Successful cancel subscribe",
            response = Object.class)
    })
    @RequestMapping(value = "/subscriptions/periodic/{subscriptionId}", produces = {"application/json"},
        consumes = {"application/json"}, method = RequestMethod.DELETE)
    ResponseEntity<String> unsubscribeLocation(
        @NotNull @ApiParam(value = "subscription id", required = true) @Valid @PathVariable
            String subscriptionId);
}
