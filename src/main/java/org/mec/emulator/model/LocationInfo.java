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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LocationInfo locationInfo = (LocationInfo) o;
        return Objects.equals(this.latitude, locationInfo.latitude) && Objects
            .equals(this.longitude, locationInfo.longitude) && Objects.equals(this.altitude, locationInfo.altitude)
            && Objects.equals(this.accuracy, locationInfo.accuracy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(latitude, longitude, altitude, accuracy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LocationInfo {\n");

        sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
        sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
        sb.append("    altitude: ").append(toIndentedString(altitude)).append("\n");
        sb.append("    accuracy: ").append(toIndentedString(accuracy)).append("\n");
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

