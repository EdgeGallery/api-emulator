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

    public UserList resourceURL(String resourceURL) {
        this.resourceURL = resourceURL;
        return this;
    }

    public void setUser(List<UserInfo> user) {
        this.user = user;
    }

    /**
     * 获取资源列表
     *
     **/
    @ApiModelProperty(required = true, value = "")
    @NotNull

    public void setResourceURL(String resourceURL) {
        this.resourceURL = resourceURL;
    }

    public String getResourceURL() {
        return resourceURL;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UserList {\n");

        sb.append("    user: ").append(toIndentedString(user)).append("\n");
        sb.append("    resourceURL: ").append(toIndentedString(resourceURL)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        return Objects.hash(user, resourceURL);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UserList userList = (UserList) o;
        return Objects.equals(this.user, userList.user) && Objects.equals(this.resourceURL, userList.resourceURL);
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

