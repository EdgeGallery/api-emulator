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

package org.mec.emulator.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import javax.validation.Valid;
import org.springframework.validation.annotation.Validated;

/**
 * InlineResponse200
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-06-05T02:11:06.510Z")

public class InlineResponse200 {
    @JsonProperty("notificationSubscriptionList")
    private InlineResponse200NotificationSubscriptionList notificationSubscriptionList = null;

    public InlineResponse200 notificationSubscriptionList(
        InlineResponse200NotificationSubscriptionList notificationSubscriptionList) {
        this.notificationSubscriptionList = notificationSubscriptionList;
        return this;
    }

    /**
     * Get notificationSubscriptionList
     *
     * @return notificationSubscriptionList
     **/
    @ApiModelProperty(value = "")

    @Valid
    public InlineResponse200NotificationSubscriptionList getNotificationSubscriptionList() {
        return notificationSubscriptionList;
    }

    public void setNotificationSubscriptionList(
        InlineResponse200NotificationSubscriptionList notificationSubscriptionList) {
        this.notificationSubscriptionList = notificationSubscriptionList;
    }

}

