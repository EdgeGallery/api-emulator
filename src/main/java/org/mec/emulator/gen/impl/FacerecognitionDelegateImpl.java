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

        LOGGER.info("Start to upload ");
        String uploadInfo = EmulatorDataMgr.getUploadInfo(file);
        LOGGER.info("Succeed to upload ");
        return uploadInfo;
    }

    @Override
    public String video(Body body) {

        return EmulatorDataMgr.getVideoInfo(body);
    }
}
