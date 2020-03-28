package org.mec.emulator.gen.delegate;

import org.mec.emulator.gen.model.Body;
import org.springframework.web.multipart.MultipartFile;


public interface FacerecognitionDelegate {

    String healthCheck();

    String recognize( MultipartFile file);

    String uploadImage( MultipartFile file);

    String video(Body body);
}
