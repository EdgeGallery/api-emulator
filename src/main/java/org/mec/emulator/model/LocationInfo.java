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
 * 位置的经纬度信息
 */
@ApiModel(description = "位置的经纬度信息")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-06-05T02:11:06.510Z")

public class LocationInfo {
    @JsonProperty("latitude")
    private Float latitude = null;

    @JsonProperty("longitude")
    private Float longitude = null;

    @JsonProperty("altitude")
    private Float altitude = null;

    @JsonProperty("accuracy")
    private Integer accuracy = null;

    public LocationInfo latitude(Float latitude) {
        this.latitude = latitude;
        return this;
    }

    /**
     * Get latitude
     *
     * @return latitude
     **/
    @ApiModelProperty(example = "80.123", required = true, value = "")
    @NotNull

    public Float getLatitude() {
        return latitude;
    }

    public void setLatitude(Float latitude) {
        this.latitude = latitude;
    }

    public LocationInfo longitude(Float longitude) {
        this.longitude = longitude;
        return this;
    }

    /**
     * Get longitude
     *
     * @return longitude
     **/
    @ApiModelProperty(example = "70.123", required = true, value = "")
    @NotNull

    public Float getLongitude() {
        return longitude;
    }

    public void setLongitude(Float longitude) {
        this.longitude = longitude;
    }

    public LocationInfo altitude(Float altitude) {
        this.altitude = altitude;
        return this;
    }

    /**
     * Get altitude
     *
     * @return altitude
     **/
    @ApiModelProperty(example = "10.0", value = "")

    public Float getAltitude() {
        return altitude;
    }

    public void setAltitude(Float altitude) {
        this.altitude = altitude;
    }

    public LocationInfo accuracy(Integer accuracy) {
        this.accuracy = accuracy;
        return this;
    }

    /**
     * Get accuracy
     *
     * @return accuracy
     **/
    @ApiModelProperty(example = "10", required = true, value = "")
    @NotNull

    public Integer getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(Integer accuracy) {
        this.accuracy = accuracy;
    }
}

