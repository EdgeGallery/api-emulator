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
 * 接入点列表
 */
@ApiModel(description = "接入点列表")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-06-05T02:11:06.510Z")

public class AccessPointList {
    @JsonProperty("zoneId")
    private String zoneId = null;

    @JsonProperty("accessPoint")
    @Valid
    private List<AccessPointInfo> accessPoint = null;

    @JsonProperty("resourceURL")
    private String resourceURL = null;

    public AccessPointList zoneId(String zoneId) {
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

    public AccessPointList accessPoint(List<AccessPointInfo> accessPoint) {
        this.accessPoint = accessPoint;
        return this;
    }

    public AccessPointList addAccessPointItem(AccessPointInfo accessPointItem) {
        if (this.accessPoint == null) {
            this.accessPoint = new ArrayList<AccessPointInfo>();
        }
        this.accessPoint.add(accessPointItem);
        return this;
    }

    /**
     * Collection of the access point information list.
     *
     * @return accessPoint
     **/
    @ApiModelProperty(value = "Collection of the access point information list.")

    @Valid

    public List<AccessPointInfo> getAccessPoint() {
        return accessPoint;
    }

    public void setAccessPoint(List<AccessPointInfo> accessPoint) {
        this.accessPoint = accessPoint;
    }

    public AccessPointList resourceURL(String resourceURL) {
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

