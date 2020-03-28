package org.mec.emulator.gen.controller;

import io.swagger.annotations.ApiParam;
import org.mec.emulator.gen.model.Body;
import org.mec.emulator.gen.delegate.FacerecognitionDelegate;

import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.apache.servicecomb.provider.rest.common.RestSchema;
import org.springframework.web.multipart.MultipartFile;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringBootProviderCodegen", date = "2020-02-21T16:25:53.995+08:00")

@RestSchema(schemaId = "facerecognition")
@RequestMapping(path = "/v1/face-recognition")
public class FacerecognitionController {

    @Autowired
    private FacerecognitionDelegate userFacerecognitionDelegate;

    @RequestMapping(value = "/",
        method = RequestMethod.GET)
    @ApiResponses({
        @ApiResponse(code = 200, response = String.class, message = "OK")
        })
    public String healthCheck(){

        return userFacerecognitionDelegate.healthCheck();
    }


    @RequestMapping(value = "/recognition",
        produces = { "application/json" }, 
        consumes = { "multipart/form-data" },
        method = RequestMethod.POST)
    @ApiResponses({
        @ApiResponse(code = 200, response = String.class, message = "OK")
        })
    public String recognize( @RequestPart(value="file", required=false) MultipartFile file){

        return userFacerecognitionDelegate.recognize(file);
    }


    @RequestMapping(value = "/upload",
        produces = { "application/json" },
        method = RequestMethod.POST)
    @ApiResponses({
        @ApiResponse(code = 200, response = String.class, message = "ok")
        })
    public String uploadImage(@ApiParam(value = "file") @RequestPart(value="file", required=false) MultipartFile file){

        return userFacerecognitionDelegate.uploadImage(file);
    }


    @RequestMapping(value = "/video",
        produces = { "application/xml", "application/json" }, 
        consumes = { "application/json", "application/xml" },
        method = RequestMethod.POST)
    @ApiResponses({
        @ApiResponse(code = 200, response = String.class, message = "OK")
        })
    public String video( @RequestBody Body body){

        return userFacerecognitionDelegate.video(body);
    }

}
