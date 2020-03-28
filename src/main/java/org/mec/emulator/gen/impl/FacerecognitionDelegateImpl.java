/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2020. All rights reserved.
 */

package org.mec.emulator.gen.impl;
import com.mec.cbb.util.log.Logger;
import com.mec.cbb.util.log.MecLogFactory;
import org.mec.emulator.EmulatorDataMgr;
import org.mec.emulator.gen.delegate.FacerecognitionDelegate;
import org.mec.emulator.gen.model.Body;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Component
public class FacerecognitionDelegateImpl implements FacerecognitionDelegate {

    private static final Logger LOGGER =
            MecLogFactory.getLogger(FacerecognitionDelegate.class);

    @Override
    public String healthCheck() {

        return EmulatorDataMgr.getHealthCheck();
    }

    @Override
    public String recognize(MultipartFile file) {

        LOGGER.info("Start to upload  ");
        String uploadInfo = EmulatorDataMgr.getFaceRecognitionInfo(file);
        LOGGER.info("Succeed to face recognition");
        return uploadInfo;

    }

    @Override
    public String uploadImage(MultipartFile file) {

        LOGGER.info("Start to upload " );
        String uploadInfo = EmulatorDataMgr.getUploadInfo(file);
        LOGGER.info("Succeed to upload ");
        return uploadInfo;
    }

    @Override
    public String video(Body body) {

        return EmulatorDataMgr.getVideoInfo(body);
    }
}
