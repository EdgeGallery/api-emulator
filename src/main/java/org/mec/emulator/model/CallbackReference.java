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
import javax.validation.constraints.NotNull;
import org.springframework.validation.annotation.Validated;

/**
 * Notification callback definition.
 */
@ApiModel(description = "Notification callback definition.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-06-05T02:11:06.510Z")
public class CallbackReference {
    @JsonProperty("notifyURL")
    private String notifyURL = null;

    public CallbackReference notifyURL(String notifyURL) {
        this.notifyURL = notifyURL;
        return this;
    }

    /**
     * Get notifyURL
     *
     * @return notifyURL
     **/
    @ApiModelProperty(required = true, value = "")
    @NotNull

    public String getNotifyURL() {
        return notifyURL;
    }

    public void setNotifyURL(String notifyURL) {
        this.notifyURL = notifyURL;
    }

}

