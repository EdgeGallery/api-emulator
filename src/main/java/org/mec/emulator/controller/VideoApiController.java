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

package org.mec.emulator.controller;

import io.swagger.annotations.ApiParam;
import javax.validation.Valid;
import org.mec.emulator.api.VideoApi;
import org.mec.emulator.model.Body;
import org.mec.emulator.service.VideoApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-06-05T02:02:00.259Z")

@Controller
public class VideoApiController implements VideoApi {

    @Autowired
    private VideoApiService videoApiService;

    public ResponseEntity<String> video(@ApiParam(value = "video url", required = true) @Valid @RequestBody Body body) {
        return new ResponseEntity<String>(videoApiService.video(body), HttpStatus.OK);
    }

}
