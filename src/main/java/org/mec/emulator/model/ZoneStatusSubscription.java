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
import java.util.Objects;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import org.springframework.validation.annotation.Validated;

/**
 * 区域状态改变的订阅消息
 */
@ApiModel(description = "区域状态改变的订阅消息")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-06-05T02:11:06.510Z")

public class ZoneStatusSubscription {
    @JsonProperty("clientCorrelator")
    private String clientCorrelator = null;

    @JsonProperty("resourceURL")
    private String resourceURL = null;

    @JsonProperty("callbackReference")
    private CallbackReference callbackReference = null;

    @JsonProperty("zoneId")
    private String zoneId = null;

    @JsonProperty("numberOfUsersZoneThreshold")
    private Integer numberOfUsersZoneThreshold = null;

    @JsonProperty("numberOfUsersAPThreshold")
    private Integer numberOfUsersAPThreshold = null;

    @JsonProperty("operationStatus")
    @Valid
    private List<OperationStatus> operationStatus = null;

    public ZoneStatusSubscription clientCorrelator(String clientCorrelator) {
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

    public ZoneStatusSubscription resourceURL(String resourceURL) {
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

    public ZoneStatusSubscription callbackReference(CallbackReference callbackReference) {
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

    public ZoneStatusSubscription zoneId(String zoneId) {
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

    public ZoneStatusSubscription numberOfUsersZoneThreshold(Integer numberOfUsersZoneThreshold) {
        this.numberOfUsersZoneThreshold = numberOfUsersZoneThreshold;
        return this;
    }

    /**
     * Get numberOfUsersZoneThreshold
     *
     * @return numberOfUsersZoneThreshold
     **/
    @ApiModelProperty(value = "")

    public Integer getNumberOfUsersZoneThreshold() {
        return numberOfUsersZoneThreshold;
    }

    public void setNumberOfUsersZoneThreshold(Integer numberOfUsersZoneThreshold) {
        this.numberOfUsersZoneThreshold = numberOfUsersZoneThreshold;
    }

    public ZoneStatusSubscription numberOfUsersAPThreshold(Integer numberOfUsersAPThreshold) {
        this.numberOfUsersAPThreshold = numberOfUsersAPThreshold;
        return this;
    }

    /**
     * Get numberOfUsersAPThreshold
     *
     * @return numberOfUsersAPThreshold
     **/
    @ApiModelProperty(value = "")

    public Integer getNumberOfUsersAPThreshold() {
        return numberOfUsersAPThreshold;
    }

    public void setNumberOfUsersAPThreshold(Integer numberOfUsersAPThreshold) {
        this.numberOfUsersAPThreshold = numberOfUsersAPThreshold;
    }

    public ZoneStatusSubscription operationStatus(List<OperationStatus> operationStatus) {
        this.operationStatus = operationStatus;
        return this;
    }

    public ZoneStatusSubscription addOperationStatusItem(OperationStatus operationStatusItem) {
        if (this.operationStatus == null) {
            this.operationStatus = new ArrayList<OperationStatus>();
        }
        this.operationStatus.add(operationStatusItem);
        return this;
    }

    /**
     * List of operation status values to generate notifications for (these apply to all access points within a zone).
     *
     * @return operationStatus
     **/
    @ApiModelProperty(
        value = "List of operation status values to generate notifications for (these apply to all access points within a zone).")

    @Valid

    public List<OperationStatus> getOperationStatus() {
        return operationStatus;
    }

    public void setOperationStatus(List<OperationStatus> operationStatus) {
        this.operationStatus = operationStatus;
    }

    @Override
    public int hashCode() {
        return Objects.hash(clientCorrelator, resourceURL, callbackReference, zoneId, numberOfUsersZoneThreshold,
            numberOfUsersAPThreshold, operationStatus);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ZoneStatusSubscription zoneStatusSubscription = (ZoneStatusSubscription) o;
        return Objects.equals(this.clientCorrelator, zoneStatusSubscription.clientCorrelator) && Objects
            .equals(this.resourceURL, zoneStatusSubscription.resourceURL) && Objects
            .equals(this.callbackReference, zoneStatusSubscription.callbackReference) && Objects
            .equals(this.zoneId, zoneStatusSubscription.zoneId) && Objects
            .equals(this.numberOfUsersZoneThreshold, zoneStatusSubscription.numberOfUsersZoneThreshold) && Objects
            .equals(this.numberOfUsersAPThreshold, zoneStatusSubscription.numberOfUsersAPThreshold) && Objects
            .equals(this.operationStatus, zoneStatusSubscription.operationStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ZoneStatusSubscription {\n");

        sb.append("    clientCorrelator: ").append(toIndentedString(clientCorrelator)).append("\n");
        sb.append("    resourceURL: ").append(toIndentedString(resourceURL)).append("\n");
        sb.append("    callbackReference: ").append(toIndentedString(callbackReference)).append("\n");
        sb.append("    zoneId: ").append(toIndentedString(zoneId)).append("\n");
        sb.append("    numberOfUsersZoneThreshold: ").append(toIndentedString(numberOfUsersZoneThreshold)).append("\n");
        sb.append("    numberOfUsersAPThreshold: ").append(toIndentedString(numberOfUsersAPThreshold)).append("\n");
        sb.append("    operationStatus: ").append(toIndentedString(operationStatus)).append("\n");
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

