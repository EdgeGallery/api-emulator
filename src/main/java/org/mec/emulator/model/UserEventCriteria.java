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

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Objects;
import org.springframework.validation.annotation.Validated;

/**
 * 用于生成通知的用户事件值列表（这些适用于指定的地址）。如果缺少此元素，则会要求为用户事件中的任何更改生成通知。
 */
@ApiModel(description = "用于生成通知的用户事件值列表（这些适用于指定的地址）。如果缺少此元素，则会要求为用户事件中的任何更改生成通知。")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-06-05T02:11:06.510Z")
public class UserEventCriteria extends ArrayList<UserEventType> {

}

