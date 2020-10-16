/*
 *    Copyright 2020 Huawei Technologies Co., Ltd.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package org.mec.emulator.controller;

import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mec.emulator.model.CallbackReference;
import org.mec.emulator.model.OperationStatus;
import org.mec.emulator.model.UserEventType;
import org.mec.emulator.model.ZonalTrafficSubscription;
import org.mec.emulator.model.ZoneStatusSubscription;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = EmulatorTests.class)
@AutoConfigureMockMvc
public class SubscriptionsApiTest {

    private Gson gson = new Gson();

    @Autowired
    private MockMvc mvc;

    @Before
    public void init() {
    }

    @Test
    public void testZonalTrafficSubDelByIdSuccess() throws Exception {
        ResultActions result = mvc.perform(
            MockMvcRequestBuilders.delete("/mep/location/v1/subscriptions/zonalTraffic/" + UUID.randomUUID().toString())
                .contentType(MediaType.APPLICATION_JSON)).andExpect(MockMvcResultMatchers.status().isNoContent())
            .andDo(MockMvcResultHandlers.print());
        Assert.assertEquals(result.andReturn().getResponse().getStatus(), 204);

    }

    @Test
    public void testZonalTrafficSubGetSuccess() throws Exception {
        ResultActions result = mvc.perform(MockMvcRequestBuilders.get("/mep/location/v1//subscriptions/zonalTraffic")
            .contentType(MediaType.APPLICATION_JSON)).andExpect(MockMvcResultMatchers.status().isOk())
            .andDo(MockMvcResultHandlers.print());
        Assert.assertEquals(result.andReturn().getResponse().getStatus(), 200);

    }

    @Test
    public void testZonalTrafficSubGetByIdSuccess() throws Exception {
        ResultActions result = mvc.perform(
            MockMvcRequestBuilders.get("/mep/location/v1/subscriptions/zonalTraffic/" + UUID.randomUUID().toString())
                .contentType(MediaType.APPLICATION_JSON)).andExpect(MockMvcResultMatchers.status().isOk())
            .andDo(MockMvcResultHandlers.print());
        Assert.assertEquals(result.andReturn().getResponse().getStatus(), 200);
    }

    @Test
    public void testZonalTrafficSubPostSuccess() throws Exception {

        ZonalTrafficSubscription zonalTraffic = new ZonalTrafficSubscription();
        zonalTraffic.setZoneId(UUID.randomUUID().toString());
        CallbackReference callbackReference = new CallbackReference();
        callbackReference.setNotifyURL("notifyURL");
        zonalTraffic.setCallbackReference(callbackReference);
        zonalTraffic.setClientCorrelator("clientCorrelator");
        zonalTraffic.setDuration("duration");
        List<String> interestRealmList = new ArrayList<String>();
        interestRealmList.add("realm1");
        interestRealmList.add("realm2");
        zonalTraffic.setInterestRealm(interestRealmList);
        zonalTraffic.setResourceURL("resourceUrl");
        List<UserEventType> typeList = new ArrayList<UserEventType>();
        typeList.add(UserEventType.ENTERING);
        typeList.add(UserEventType.LEAVING);
        typeList.add(UserEventType.TRANSFERRING);
        zonalTraffic.setUserEventCriteria(typeList);
        ResultActions result = mvc.perform(MockMvcRequestBuilders.post("/mep/location/v1//subscriptions/zonalTraffic")
            .contentType(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON)
            .content(gson.toJson(zonalTraffic))).andExpect(MockMvcResultMatchers.status().isCreated())
            .andDo(MockMvcResultHandlers.print());
        Assert.assertEquals(result.andReturn().getResponse().getStatus(), 201);
    }

    @Test
    public void testZoneStatusDelByIdSuccess() throws Exception {
        ResultActions result = mvc.perform(
            MockMvcRequestBuilders.delete("/mep/location/v1/subscriptions/zoneStatus/" + UUID.randomUUID().toString())
                .contentType(MediaType.APPLICATION_JSON)).andExpect(MockMvcResultMatchers.status().isNoContent())
            .andDo(MockMvcResultHandlers.print());
        Assert.assertEquals(result.andReturn().getResponse().getStatus(), 204);
    }

    @Test
    public void testZoneStatusGetSuccess() throws Exception {
        ResultActions result = mvc.perform(MockMvcRequestBuilders.get("/mep/location/v1/subscriptions/zonalStatus")
            .contentType(MediaType.APPLICATION_JSON)).andExpect(MockMvcResultMatchers.status().isOk())
            .andDo(MockMvcResultHandlers.print());
        Assert.assertEquals(result.andReturn().getResponse().getStatus(), 200);
    }

    @Test
    public void testZoneStatusGetByIdSuccess() throws Exception {
        ResultActions result = mvc.perform(
            MockMvcRequestBuilders.get("/mep/location/v1/subscriptions/zoneStatus/" + UUID.randomUUID().toString())
                .contentType(MediaType.APPLICATION_JSON)).andExpect(MockMvcResultMatchers.status().isOk())
            .andDo(MockMvcResultHandlers.print());
        Assert.assertEquals(result.andReturn().getResponse().getStatus(), 200);
    }

    @Test
    public void testZoneStatusPostSuccess() throws Exception {

        ZoneStatusSubscription zoneStatus = new ZoneStatusSubscription();
        zoneStatus.setZoneId(UUID.randomUUID().toString());
        CallbackReference callbackReference = new CallbackReference();
        callbackReference.setNotifyURL("notifyURL");
        zoneStatus.setCallbackReference(callbackReference);
        zoneStatus.setClientCorrelator("clientCorrelator");
        zoneStatus.setNumberOfUsersAPThreshold(100);
        zoneStatus.setNumberOfUsersZoneThreshold(50);
        List<OperationStatus> statusList = new ArrayList<OperationStatus>();
        statusList.add(OperationStatus.SERVICEABLE);
        statusList.add(OperationStatus.UNSERVICEABLE);
        statusList.add(OperationStatus.UNKNOWN);
        zoneStatus.setOperationStatus(statusList);
        zoneStatus.setResourceURL("resourceUrl");
        ResultActions result = mvc.perform(MockMvcRequestBuilders.post("/mep/location/v1/subscriptions/zonalStatus")
            .contentType(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON)
            .content(gson.toJson(zoneStatus))).andExpect(MockMvcResultMatchers.status().isCreated())
            .andDo(MockMvcResultHandlers.print());
        Assert.assertEquals(result.andReturn().getResponse().getStatus(), 201);
    }
}
