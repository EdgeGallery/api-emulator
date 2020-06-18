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
 * 区域订阅的通知
 */
@ApiModel(description = "区域订阅的通知")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-06-05T02:11:06.510Z")

public class ZonalPresenceNotification {
    @JsonProperty("callbackData")
    private String callbackData = null;

    @JsonProperty("zoneId")
    private String zoneId = null;

    @JsonProperty("address")
    private String address = null;

    @JsonProperty("interestRealm")
    private String interestRealm = null;

    @JsonProperty("userEventType")
    private UserEventType userEventType = null;

    @JsonProperty("currentAccessPointId")
    private String currentAccessPointId = null;

    @JsonProperty("previousAccessPointId")
    private String previousAccessPointId = null;

    @JsonProperty("timestamp")
    private String timestamp = null;

    @JsonProperty("link")
    @Valid
    private List<Link> link = null;

    public ZonalPresenceNotification callbackData(String callbackData) {
        this.callbackData = callbackData;
        return this;
    }

    /**
     * Get callbackData
     *
     * @return callbackData
     **/
    @ApiModelProperty(value = "")

    public String getCallbackData() {
        return callbackData;
    }

    public void setCallbackData(String callbackData) {
        this.callbackData = callbackData;
    }

    public ZonalPresenceNotification zoneId(String zoneId) {
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

    public ZonalPresenceNotification address(String address) {
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

    public ZonalPresenceNotification interestRealm(String interestRealm) {
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

    public ZonalPresenceNotification userEventType(UserEventType userEventType) {
        this.userEventType = userEventType;
        return this;
    }

    /**
     * Get userEventType
     *
     * @return userEventType
     **/
    @ApiModelProperty(required = true, value = "")
    @NotNull

    @Valid

    public UserEventType getUserEventType() {
        return userEventType;
    }

    public void setUserEventType(UserEventType userEventType) {
        this.userEventType = userEventType;
    }

    public ZonalPresenceNotification currentAccessPointId(String currentAccessPointId) {
        this.currentAccessPointId = currentAccessPointId;
        return this;
    }

    /**
     * Get currentAccessPointId
     *
     * @return currentAccessPointId
     **/
    @ApiModelProperty(required = true, value = "")
    @NotNull

    public String getCurrentAccessPointId() {
        return currentAccessPointId;
    }

    public void setCurrentAccessPointId(String currentAccessPointId) {
        this.currentAccessPointId = currentAccessPointId;
    }

    public ZonalPresenceNotification previousAccessPointId(String previousAccessPointId) {
        this.previousAccessPointId = previousAccessPointId;
        return this;
    }

    /**
     * Get previousAccessPointId
     *
     * @return previousAccessPointId
     **/
    @ApiModelProperty(value = "")

    public String getPreviousAccessPointId() {
        return previousAccessPointId;
    }

    public void setPreviousAccessPointId(String previousAccessPointId) {
        this.previousAccessPointId = previousAccessPointId;
    }

    public ZonalPresenceNotification timestamp(String timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * Get timestamp
     *
     * @return timestamp
     **/
    @ApiModelProperty(required = true, value = "")
    @NotNull

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public ZonalPresenceNotification link(List<Link> link) {
        this.link = link;
        return this;
    }

    public ZonalPresenceNotification addLinkItem(Link linkItem) {
        if (this.link == null) {
            this.link = new ArrayList<Link>();
        }
        this.link.add(linkItem);
        return this;
    }

    /**
     * Link to other resources that are in relationship with this notification. The server SHOULD include a link to the related subscription. No other links are required or suggested by this specification.
     *
     * @return link
     **/
    @ApiModelProperty(
        example = "\"rel=\\\"ZonalTrafficSubscription\\\" href=\\\"http://example.com/exampleAPI/location/v1/subscriptions/zonalTraffic/sub123\\\"/\"",
        value = "Link to other resources that are in relationship with this notification. The server SHOULD include a link to the related subscription. No other links are required or suggested by this specification.")

    @Valid

    public List<Link> getLink() {
        return link;
    }

    public void setLink(List<Link> link) {
        this.link = link;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ZonalPresenceNotification zonalPresenceNotification = (ZonalPresenceNotification) o;
        return Objects.equals(this.callbackData, zonalPresenceNotification.callbackData) && Objects
            .equals(this.zoneId, zonalPresenceNotification.zoneId) && Objects
            .equals(this.address, zonalPresenceNotification.address) && Objects
            .equals(this.interestRealm, zonalPresenceNotification.interestRealm) && Objects
            .equals(this.userEventType, zonalPresenceNotification.userEventType) && Objects
            .equals(this.currentAccessPointId, zonalPresenceNotification.currentAccessPointId) && Objects
            .equals(this.previousAccessPointId, zonalPresenceNotification.previousAccessPointId) && Objects
            .equals(this.timestamp, zonalPresenceNotification.timestamp) && Objects
            .equals(this.link, zonalPresenceNotification.link);
    }

    @Override
    public int hashCode() {
        return Objects.hash(callbackData, zoneId, address, interestRealm, userEventType, currentAccessPointId,
            previousAccessPointId, timestamp, link);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ZonalPresenceNotification {\n");

        sb.append("    callbackData: ").append(toIndentedString(callbackData)).append("\n");
        sb.append("    zoneId: ").append(toIndentedString(zoneId)).append("\n");
        sb.append("    address: ").append(toIndentedString(address)).append("\n");
        sb.append("    interestRealm: ").append(toIndentedString(interestRealm)).append("\n");
        sb.append("    userEventType: ").append(toIndentedString(userEventType)).append("\n");
        sb.append("    currentAccessPointId: ").append(toIndentedString(currentAccessPointId)).append("\n");
        sb.append("    previousAccessPointId: ").append(toIndentedString(previousAccessPointId)).append("\n");
        sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
        sb.append("    link: ").append(toIndentedString(link)).append("\n");
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

