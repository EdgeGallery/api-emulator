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
 * 用户信息
 */
@ApiModel(description = "用户信息")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-06-05T02:11:06.510Z")

public class UserInfo {
    @JsonProperty("address")
    private String address = null;

    @JsonProperty("accessPointId")
    private String accessPointId = null;

    @JsonProperty("zoneId")
    private String zoneId = null;

    @JsonProperty("resourceURL")
    private String resourceURL = null;

    @JsonProperty("locationInfo")
    private LocationInfo locationInfo = null;

    @JsonProperty("contextLocationInfo")
    private String contextLocationInfo = null;

    @JsonProperty("ancillaryInfo")
    private String ancillaryInfo = null;

    public UserInfo address(String address) {
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

    public UserInfo accessPointId(String accessPointId) {
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

    public UserInfo zoneId(String zoneId) {
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

    public UserInfo resourceURL(String resourceURL) {
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

    public UserInfo locationInfo(LocationInfo locationInfo) {
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

    public UserInfo contextLocationInfo(String contextLocationInfo) {
        this.contextLocationInfo = contextLocationInfo;
        return this;
    }

    /**
     * Get contextLocationInfo
     *
     * @return contextLocationInfo
     **/
    @ApiModelProperty(value = "")

    public String getContextLocationInfo() {
        return contextLocationInfo;
    }

    public void setContextLocationInfo(String contextLocationInfo) {
        this.contextLocationInfo = contextLocationInfo;
    }

    public UserInfo ancillaryInfo(String ancillaryInfo) {
        this.ancillaryInfo = ancillaryInfo;
        return this;
    }

    /**
     * Get ancillaryInfo
     *
     * @return ancillaryInfo
     **/
    @ApiModelProperty(value = "")
    public String getAncillaryInfo() {
        return ancillaryInfo;
    }

    public void setAncillaryInfo(String ancillaryInfo) {
        this.ancillaryInfo = ancillaryInfo;
    }

}

