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
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import org.springframework.validation.annotation.Validated;

/**
 * 区域状态改变的通知信息
 */
@ApiModel(description = "区域状态改变的通知信息")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-06-05T02:11:06.510Z")

public class ZoneStatusNotification {
    @JsonProperty("callbackData")
    private String callbackData = null;

    @JsonProperty("zoneId")
    private String zoneId = null;

    @JsonProperty("accessPointId")
    private String accessPointId = null;

    @JsonProperty("numberOfUsersInZone")
    private Integer numberOfUsersInZone = null;

    @JsonProperty("numberOfUsersInAP")
    private Integer numberOfUsersInAP = null;

    @JsonProperty("operationStatus")
    private OperationStatus operationStatus = null;

    @JsonProperty("timestamp")
    private String timestamp = null;

    @JsonProperty("link")
    @Valid
    private List<Link> link = null;

    public ZoneStatusNotification callbackData(String callbackData) {
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

    public ZoneStatusNotification zoneId(String zoneId) {
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

    public ZoneStatusNotification accessPointId(String accessPointId) {
        this.accessPointId = accessPointId;
        return this;
    }

    /**
     * Get accessPointId
     *
     * @return accessPointId
     **/
    @ApiModelProperty(value = "")

    public String getAccessPointId() {
        return accessPointId;
    }

    public void setAccessPointId(String accessPointId) {
        this.accessPointId = accessPointId;
    }

    public ZoneStatusNotification numberOfUsersInZone(Integer numberOfUsersInZone) {
        this.numberOfUsersInZone = numberOfUsersInZone;
        return this;
    }

    /**
     * Get numberOfUsersInZone
     *
     * @return numberOfUsersInZone
     **/
    @ApiModelProperty(value = "")

    public Integer getNumberOfUsersInZone() {
        return numberOfUsersInZone;
    }

    public void setNumberOfUsersInZone(Integer numberOfUsersInZone) {
        this.numberOfUsersInZone = numberOfUsersInZone;
    }

    public ZoneStatusNotification numberOfUsersInAP(Integer numberOfUsersInAP) {
        this.numberOfUsersInAP = numberOfUsersInAP;
        return this;
    }

    /**
     * Get numberOfUsersInAP
     *
     * @return numberOfUsersInAP
     **/
    @ApiModelProperty(value = "")

    public Integer getNumberOfUsersInAP() {
        return numberOfUsersInAP;
    }

    public void setNumberOfUsersInAP(Integer numberOfUsersInAP) {
        this.numberOfUsersInAP = numberOfUsersInAP;
    }

    public ZoneStatusNotification operationStatus(OperationStatus operationStatus) {
        this.operationStatus = operationStatus;
        return this;
    }

    /**
     * Get operationStatus
     *
     * @return operationStatus
     **/
    @ApiModelProperty(value = "")

    @Valid

    public OperationStatus getOperationStatus() {
        return operationStatus;
    }

    public void setOperationStatus(OperationStatus operationStatus) {
        this.operationStatus = operationStatus;
    }

    public ZoneStatusNotification timestamp(String timestamp) {
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

    public ZoneStatusNotification link(List<Link> link) {
        this.link = link;
        return this;
    }

    public ZoneStatusNotification addLinkItem(Link linkItem) {
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
        example = "\"rel=\\\"ZonalStatusSubscription\\\" href=\\\"http://example.com/exampleAPI/location/v1/subscriptions/zonalStatus/sub123\\\"\"",
        value = "Link to other resources that are in relationship with this notification. The server SHOULD include a link to the related subscription. No other links are required or suggested by this specification.")

    @Valid

    public List<Link> getLink() {
        return link;
    }

    public void setLink(List<Link> link) {
        this.link = link;
    }

}

