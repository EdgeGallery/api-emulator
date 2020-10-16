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
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import org.springframework.validation.annotation.Validated;

/**
 * 接入点信息的类型定义
 */
@ApiModel(description = "接入点信息的类型定义")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-06-05T02:11:06.510Z")

public class AccessPointInfo {
    @JsonProperty("accessPointId")
    private String accessPointId = null;

    @JsonProperty("locationInfo")
    private LocationInfo locationInfo = null;

    @JsonProperty("connectionType")
    private ConnectionType connectionType = null;

    @JsonProperty("operationStatus")
    private OperationStatus operationStatus = null;

    @JsonProperty("numberOfUsers")
    private Integer numberOfUsers = null;

    @JsonProperty("timezone")
    private String timezone = null;

    @JsonProperty("interestRealm")
    private String interestRealm = null;

    @JsonProperty("resourceURL")
    private String resourceURL = null;

    public AccessPointInfo accessPointId(String accessPointId) {
        this.accessPointId = accessPointId;
        return this;
    }

    /**
     * Get accessPointId
     *
     * @return accessPointId
     **/
    @ApiModelProperty(required = true, value = "")
    @NotNull

    public String getAccessPointId() {
        return accessPointId;
    }

    public void setAccessPointId(String accessPointId) {
        this.accessPointId = accessPointId;
    }

    public AccessPointInfo locationInfo(LocationInfo locationInfo) {
        this.locationInfo = locationInfo;
        return this;
    }

    /**
     * Get locationInfo
     *
     * @return locationInfo
     **/
    @ApiModelProperty(value = "")

    @Valid

    public LocationInfo getLocationInfo() {
        return locationInfo;
    }

    public void setLocationInfo(LocationInfo locationInfo) {
        this.locationInfo = locationInfo;
    }

    public AccessPointInfo connectionType(ConnectionType connectionType) {
        this.connectionType = connectionType;
        return this;
    }

    /**
     * Get connectionType
     *
     * @return connectionType
     **/
    @ApiModelProperty(required = true, value = "")
    @NotNull

    @Valid

    public ConnectionType getConnectionType() {
        return connectionType;
    }

    public void setConnectionType(ConnectionType connectionType) {
        this.connectionType = connectionType;
    }

    public AccessPointInfo operationStatus(OperationStatus operationStatus) {
        this.operationStatus = operationStatus;
        return this;
    }

    /**
     * Get operationStatus
     *
     * @return operationStatus
     **/
    @ApiModelProperty(required = true, value = "")
    @NotNull

    @Valid

    public OperationStatus getOperationStatus() {
        return operationStatus;
    }

    public void setOperationStatus(OperationStatus operationStatus) {
        this.operationStatus = operationStatus;
    }

    public AccessPointInfo numberOfUsers(Integer numberOfUsers) {
        this.numberOfUsers = numberOfUsers;
        return this;
    }

    /**
     * Get numberOfUsers
     *
     * @return numberOfUsers
     **/
    @ApiModelProperty(required = true, value = "")
    @NotNull

    public Integer getNumberOfUsers() {
        return numberOfUsers;
    }

    public void setNumberOfUsers(Integer numberOfUsers) {
        this.numberOfUsers = numberOfUsers;
    }

    public AccessPointInfo timezone(String timezone) {
        this.timezone = timezone;
        return this;
    }

    /**
     * Get timezone
     *
     * @return timezone
     **/
    @ApiModelProperty(value = "")

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public AccessPointInfo interestRealm(String interestRealm) {
        this.interestRealm = interestRealm;
        return this;
    }

    /**
     * Get interestRealm
     *
     * @return interestRealm
     **/
    @ApiModelProperty(value = "")

    public String getInterestRealm() {
        return interestRealm;
    }

    public void setInterestRealm(String interestRealm) {
        this.interestRealm = interestRealm;
    }

    public AccessPointInfo resourceURL(String resourceURL) {
        this.resourceURL = resourceURL;
        return this;
    }

    /**
     * Get resourceURL
     *
     * @return resourceURL
     **/
    @ApiModelProperty(required = true, value = "")
    @NotNull

    public String getResourceURL() {
        return resourceURL;
    }

    public void setResourceURL(String resourceURL) {
        this.resourceURL = resourceURL;
    }

}

