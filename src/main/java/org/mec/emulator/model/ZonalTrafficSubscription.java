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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import org.springframework.validation.annotation.Validated;

/**
 * 区域跟踪订阅
 */
@ApiModel(description = "区域跟踪订阅")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-06-05T02:11:06.510Z")
public class ZonalTrafficSubscription {
    @JsonProperty("clientCorrelator")
    private String clientCorrelator = null;

    @JsonProperty("callbackReference")
    private CallbackReference callbackReference = null;

    @JsonProperty("zoneId")
    private String zoneId = null;

    @JsonProperty("interestRealm")
    @Valid
    private List<String> interestRealm = null;

    @JsonProperty("userEventCriteria")
    @Valid
    private List<UserEventType> userEventCriteria = null;

    @JsonProperty("duration")
    private String duration = null;

    @JsonProperty("resourceURL")
    private String resourceURL = null;

    public ZonalTrafficSubscription clientCorrelator(String clientCorrelator) {
        this.clientCorrelator = clientCorrelator;
        return this;
    }

    /**
     * Get clientCorrelator
     *
     * @return clientCorrelator
     **/
    @ApiModelProperty(value = "")

    public String getClientCorrelator() {
        return clientCorrelator;
    }

    public void setClientCorrelator(String clientCorrelator) {
        this.clientCorrelator = clientCorrelator;
    }

    public ZonalTrafficSubscription callbackReference(CallbackReference callbackReference) {
        this.callbackReference = callbackReference;
        return this;
    }

    /**
     * Get callbackReference
     *
     * @return callbackReference
     **/
    @ApiModelProperty(required = true, value = "")
    @NotNull

    @Valid

    public CallbackReference getCallbackReference() {
        return callbackReference;
    }

    public void setCallbackReference(CallbackReference callbackReference) {
        this.callbackReference = callbackReference;
    }

    public ZonalTrafficSubscription zoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }

    /**
     * Get zoneId
     *
     * @return zoneId
     **/
    @ApiModelProperty(required = true, value = "")
    @NotNull

    public String getZoneId() {
        return zoneId;
    }

    public void setZoneId(String zoneId) {
        this.zoneId = zoneId;
    }

    public ZonalTrafficSubscription interestRealm(List<String> interestRealm) {
        this.interestRealm = interestRealm;
        return this;
    }

    public ZonalTrafficSubscription addInterestRealmItem(String interestRealmItem) {
        if (this.interestRealm == null) {
            this.interestRealm = new ArrayList<String>();
        }
        this.interestRealm.add(interestRealmItem);
        return this;
    }

    /**
     * Interest realms of access points within a zone (e.g. geographical area, a type of industry etc.).
     *
     * @return interestRealm
     **/
    @ApiModelProperty(
        value = "Interest realms of access points within a zone (e.g. geographical area, a type of industry etc.).")

    public List<String> getInterestRealm() {
        return interestRealm;
    }

    public void setInterestRealm(List<String> interestRealm) {
        this.interestRealm = interestRealm;
    }

    public ZonalTrafficSubscription userEventCriteria(List<UserEventType> userEventCriteria) {
        this.userEventCriteria = userEventCriteria;
        return this;
    }

    public ZonalTrafficSubscription addUserEventCriteriaItem(UserEventType userEventCriteriaItem) {
        if (this.userEventCriteria == null) {
            this.userEventCriteria = new ArrayList<UserEventType>();
        }
        this.userEventCriteria.add(userEventCriteriaItem);
        return this;
    }

    /**
     * List of user event values to generate notifications for (these apply to zone identifier or all interest realms within zone identifier specified). If this element is missing, a notification is requested to be generated for any change in user event.
     *
     * @return userEventCriteria
     **/
    @ApiModelProperty(
        value = "List of user event values to generate notifications for (these apply to zone identifier or all interest realms within zone identifier specified). If this element is missing, a notification is requested to be generated for any change in user event.")
    @Valid
    public List<UserEventType> getUserEventCriteria() {
        return userEventCriteria;
    }

    public void setUserEventCriteria(List<UserEventType> userEventCriteria) {
        this.userEventCriteria = userEventCriteria;
    }

    public ZonalTrafficSubscription duration(String duration) {
        this.duration = duration;
        return this;
    }

    /**
     * Get duration
     *
     * @return duration
     **/
    @ApiModelProperty(value = "")
    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public ZonalTrafficSubscription resourceURL(String resourceURL) {
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

