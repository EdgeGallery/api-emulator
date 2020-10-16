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
 * 用户列表
 */
@ApiModel(description = "用户列表")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-06-05T02:11:06.510Z")

public class UserList {
    @JsonProperty("user")
    @Valid
    private List<UserInfo> user = null;

    @JsonProperty("resourceURL")
    private String resourceURL = null;

    public UserList user(List<UserInfo> user) {
        this.user = user;
        return this;
    }

    public UserList addUserItem(UserInfo userItem) {
        if (this.user == null) {
            this.user = new ArrayList<UserInfo>();
        }
        this.user.add(userItem);
        return this;
    }

    /**
     * 区域用户信息列表。
     *
     * @return user
     **/
    @ApiModelProperty(value = "区域用户信息列表。")

    @Valid

    public List<UserInfo> getUser() {
        return user;
    }

    public void setUser(List<UserInfo> user) {
        this.user = user;
    }

    public UserList resourceURL(String resourceURL) {
        this.resourceURL = resourceURL;
        return this;
    }

    public String getResourceURL() {
        return resourceURL;
    }

    /**
     * 获取资源列表
     **/
    @ApiModelProperty(required = true, value = "")
    @NotNull

    public void setResourceURL(String resourceURL) {
        this.resourceURL = resourceURL;
    }

}

