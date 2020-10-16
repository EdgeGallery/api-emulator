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

import java.util.UUID;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
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
public class UsersApiTest {

    @Autowired
    private MockMvc mvc;

    @Before
    public void init() {
    }

    @Test
    public void testUsersGetSuccess() throws Exception {
        String zoneId = "38b8ae9e-cbe2-4ce5-8ba9-4bf05481e6c3";
        String accessPointId = "933d3eb5-ff66-43e4-8434-28b1212ea1cc";
        ResultActions result = mvc.perform(
            MockMvcRequestBuilders.get("/mep/location/v1/users?zoneId=" + zoneId + "&accessPointId=" + accessPointId)
                .contentType(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON))
            .andExpect(MockMvcResultMatchers.status().isOk()).andDo(MockMvcResultHandlers.print());
        Assert.assertEquals(result.andReturn().getResponse().getStatus(), 200);
    }

    @Test
    public void testUsersGetByIdSuccess() throws Exception {
        ResultActions result = mvc.perform(
            MockMvcRequestBuilders.get("/mep/location/v1/users/" + UUID.randomUUID().toString())
                .contentType(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON))
            .andExpect(MockMvcResultMatchers.status().isOk()).andDo(MockMvcResultHandlers.print());
        Assert.assertEquals(result.andReturn().getResponse().getStatus(), 200);
    }

}
