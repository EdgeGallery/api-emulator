# api-emulator

[![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](https://opensource.org/licenses/Apache-2.0)
![Jenkins](https://img.shields.io/jenkins/build?jobUrl=http://jenkins.edgegallery.org/job/api-emulator-docker-master-daily/)

api-emulatorModule，forEdgeGalleryProvides a simulation of basic capabilitiesapi，Developers can call the simulator providedapi，You can view the existing capabilities of the platform without real deployment。At the momentapi-emulatorIntegrated two platform capabilities：Location services and face recognition capabilities。

## Introduction to platform capabilities

- **Location service**

  Provide user location，EdgeGallery APPCan get the location of the user
  
  Subscription and notification，Provide electronic fence and regional congestion state events
  
  Area status，EdgeGallery APPProcess the downlink data according to the regional congestion status provided by the platform。
  
  The process of obtaining location information is divided into three stages：
  1. First fromMRPDiscovery Service，MEPReturn all services or service information that meets the query parameters。
  2. Simulator access based on service addressAPI service，Get geographic location。The address location in the simulator has a built-in static address192.0.2.1.
  3. EdgeGallery APPDo other processing based on address location

- **Face recognition**

  Face upload，Upload face image
  Face recognition，Upload a face image and recognize it
  Video face recognition
  
  The face recognition process is as follows:：
  1. Upload face photos：Only one face is required、The name of the picture is the name of the person、The picture format ispng。
  2. Upload another face image for recognition，Return to face position、Recognized face information。
  3. For face recognition in the camera，Input cameraurl，Can。
  
  **3.Instructions：** 
  log inEdgeGalleryDeveloper platform。
  After creating a new project, it will automatically start oneapi-emulatorcontainer，The interface will pop upAPIDetails，Developer enters the parameters to call directlyapiCan。
  
  - **Make a mirror：** Recommended Use/docker/DockerfileFile mirroring，DockerfileThe file needs to be packaged and generated with the projecttargetFolders are placed in the same level directory，Otherwise, the executable cannot be foundjarPackages and dependencies。
  Use the command`docker run build .` Build image
  
- ### KubernetesEnvironment deployment

  api-emulatorProvides deployment inKubernetesDeployment template for the environment
  Recommended Use/deploy/api-emulator.yamlFile for deployment，
  
