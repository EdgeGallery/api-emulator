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

/**
 * NOTE: This class is auto generated by the swagger code generator program (2.4.14).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */

package org.mec.emulator.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import javax.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-06-05T02:02:00.259Z")

@Api(value = "recognition", description = "the recognition API")
@RequestMapping(value = "/v1/face-recognition")
public interface RecognitionApi {

    @ApiOperation(value = "recognize", nickname = "recognize", notes = "recognize", response = String.class,
        tags = {"FaceRecognition",})
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "OK", response = String.class)
    })
    @RequestMapping(value = "/recognition", produces = {"application/json"}, consumes = {"multipart/form-data"},
        method = RequestMethod.POST)
    ResponseEntity<String> recognize(
        @ApiParam(value = "file to upload") @Valid @RequestPart(value = "file", required = false) MultipartFile file);

}