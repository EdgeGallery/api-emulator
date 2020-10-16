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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.validation.Valid;
import org.springframework.validation.annotation.Validated;

/**
 * InlineResponse2001NotificationSubscriptionList
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-06-05T02:11:06.510Z")

public class InlineResponse2001NotificationSubscriptionList {
    @JsonProperty("zoneStatusSubscription")
    @Valid
    private List<ZoneStatusSubscription> zoneStatusSubscription = null;

    @JsonProperty("resourceURL")
    private String resourceURL = null;

    public InlineResponse2001NotificationSubscriptionList zoneStatusSubscription(
        List<ZoneStatusSubscription> zoneStatusSubscription) {
        this.zoneStatusSubscription = zoneStatusSubscription;
        return this;
    }

    public InlineResponse2001NotificationSubscriptionList addZoneStatusSubscriptionItem(
        ZoneStatusSubscription zoneStatusSubscriptionItem) {
        if (this.zoneStatusSubscription == null) {
            this.zoneStatusSubscription = new ArrayList<ZoneStatusSubscription>();
        }
        this.zoneStatusSubscription.add(zoneStatusSubscriptionItem);
        return this;
    }

    /**
     * Get zoneStatusSubscription
     *
     * @return zoneStatusSubscription
     **/
    @ApiModelProperty(value = "")

    @Valid

    public List<ZoneStatusSubscription> getZoneStatusSubscription() {
        return zoneStatusSubscription;
    }

    public void setZoneStatusSubscription(List<ZoneStatusSubscription> zoneStatusSubscription) {
        this.zoneStatusSubscription = zoneStatusSubscription;
    }

    public InlineResponse2001NotificationSubscriptionList resourceURL(String resourceURL) {
        this.resourceURL = resourceURL;
        return this;
    }

    /**
     * Get resourceURL
     *
     * @return resourceURL
     **/
    @ApiModelProperty(value = "")

    public String getResourceURL() {
        return resourceURL;
    }

    public void setResourceURL(String resourceURL) {
        this.resourceURL = resourceURL;
    }

}

