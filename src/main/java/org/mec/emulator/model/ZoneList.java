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
 * 区域列表
 */
@ApiModel(description = "区域列表")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-06-05T02:11:06.510Z")

public class ZoneList {
    @JsonProperty("zone")
    @Valid
    private List<ZoneInfo> zone = null;

    @JsonProperty("resourceURL")
    private String resourceURL = null;

    public ZoneList zone(List<ZoneInfo> zone) {
        this.zone = zone;
        return this;
    }

    public ZoneList addZoneItem(ZoneInfo zoneItem) {
        if (this.zone == null) {
            this.zone = new ArrayList<ZoneInfo>();
        }
        this.zone.add(zoneItem);
        return this;
    }

    /**
     * Collection of the zone information list.
     *
     * @return zone
     **/
    @ApiModelProperty(value = "Collection of the zone information list.")

    @Valid

    public List<ZoneInfo> getZone() {
        return zone;
    }

    public void setZone(List<ZoneInfo> zone) {
        this.zone = zone;
    }

    public ZoneList resourceURL(String resourceURL) {
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

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || getClass() != object.getClass()) {
            return false;
        }
        ZoneList zoneList = (ZoneList) object;
        return Objects.equals(this.zone, zoneList.zone) && Objects.equals(this.resourceURL, zoneList.resourceURL);
    }

    @Override
    public int hashCode() {
        return Objects.hash(zone, resourceURL);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ZoneList {\n");

        sb.append("    zone: ").append(toIndentedString(zone)).append("\n");
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

