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
import java.util.Objects;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import org.springframework.validation.annotation.Validated;

/**
 * 包含用户跟踪订阅的类型。
 */
@ApiModel(description = "包含用户跟踪订阅的类型。")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-06-05T02:11:06.510Z")

public class UserTrackingSubscription {
    @JsonProperty("clientCorrelator")
    private String clientCorrelator = null;

    @JsonProperty("callbackReference")
    private CallbackReference callbackReference = null;

    @JsonProperty("address")
    private String address = null;

    @JsonProperty("userEventCriteria")
    private UserEventCriteria userEventCriteria = null;

    @JsonProperty("resourceURL")
    private String resourceURL = null;

    public UserTrackingSubscription clientCorrelator(String clientCorrelator) {
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

    public UserTrackingSubscription callbackReference(CallbackReference callbackReference) {
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

    public UserTrackingSubscription address(String address) {
        this.address = address;
        return this;
    }

    /**
     * Get address
     *
     * @return address
     **/
    @ApiModelProperty(required = true, value = "")
    @NotNull

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public UserTrackingSubscription userEventCriteria(UserEventCriteria userEventCriteria) {
        this.userEventCriteria = userEventCriteria;
        return this;
    }

    /**
     * Get userEventCriteria
     *
     * @return userEventCriteria
     **/
    @ApiModelProperty(value = "")

    @Valid

    public UserEventCriteria getUserEventCriteria() {
        return userEventCriteria;
    }

    public void setUserEventCriteria(UserEventCriteria userEventCriteria) {
        this.userEventCriteria = userEventCriteria;
    }

    public UserTrackingSubscription resourceURL(String resourceURL) {
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

    @Override
    public int hashCode() {
        return Objects.hash(clientCorrelator, callbackReference, address, userEventCriteria, resourceURL);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UserTrackingSubscription userTrackingSubscription = (UserTrackingSubscription) o;
        return Objects.equals(this.clientCorrelator, userTrackingSubscription.clientCorrelator) && Objects
            .equals(this.callbackReference, userTrackingSubscription.callbackReference) && Objects
            .equals(this.address, userTrackingSubscription.address) && Objects
            .equals(this.userEventCriteria, userTrackingSubscription.userEventCriteria) && Objects
            .equals(this.resourceURL, userTrackingSubscription.resourceURL);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UserTrackingSubscription {\n");

        sb.append("    clientCorrelator: ").append(toIndentedString(clientCorrelator)).append("\n");
        sb.append("    callbackReference: ").append(toIndentedString(callbackReference)).append("\n");
        sb.append("    address: ").append(toIndentedString(address)).append("\n");
        sb.append("    userEventCriteria: ").append(toIndentedString(userEventCriteria)).append("\n");
        sb.append("    resourceURL: ").append(toIndentedString(resourceURL)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}

