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
import javax.validation.constraints.NotNull;
import org.springframework.validation.annotation.Validated;

/**
 * 区域信息
 */
@ApiModel(description = "区域信息")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-06-05T02:11:06.510Z")
public class ZoneInfo {
    @JsonProperty("zoneId")
    private String zoneId = null;

    @JsonProperty("numberOfAccessPoints")
    private Integer numberOfAccessPoints = null;

    @JsonProperty("numberOfUnserviceableAccessPoints")
    private Integer numberOfUnserviceableAccessPoints = null;

    @JsonProperty("numberOfUsers")
    private Integer numberOfUsers = null;

    @JsonProperty("resourceURL")
    private String resourceURL = null;

    public ZoneInfo zoneId(String zoneId) {
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

    public ZoneInfo numberOfAccessPoints(Integer numberOfAccessPoints) {
        this.numberOfAccessPoints = numberOfAccessPoints;
        return this;
    }

    /**
     * Get numberOfAccessPoints
     *
     * @return numberOfAccessPoints
     **/
    @ApiModelProperty(required = true, value = "")
    @NotNull
    public Integer getNumberOfAccessPoints() {
        return numberOfAccessPoints;
    }

    public void setNumberOfAccessPoints(Integer numberOfAccessPoints) {
        this.numberOfAccessPoints = numberOfAccessPoints;
    }

    public ZoneInfo numberOfUnserviceableAccessPoints(Integer numberOfUnserviceableAccessPoints) {
        this.numberOfUnserviceableAccessPoints = numberOfUnserviceableAccessPoints;
        return this;
    }

    /**
     * Get numberOfUnserviceableAccessPoints
     *
     * @return numberOfUnserviceableAccessPoints
     **/
    @ApiModelProperty(required = true, value = "")
    @NotNull
    public Integer getNumberOfUnserviceableAccessPoints() {
        return numberOfUnserviceableAccessPoints;
    }

    public void setNumberOfUnserviceableAccessPoints(Integer numberOfUnserviceableAccessPoints) {
        this.numberOfUnserviceableAccessPoints = numberOfUnserviceableAccessPoints;
    }

    public ZoneInfo numberOfUsers(Integer numberOfUsers) {
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

    public ZoneInfo resourceURL(String resourceURL) {
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

