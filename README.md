# api-emulator

[![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](https://opensource.org/licenses/Apache-2.0)


api-emulator模块，为EdgeGallery提供了基本能力的模拟api，开发者可以调用该模拟器提供的api，不需要真实部署就可以查看平台已有的能力。目前该api-emulator集成了两种平台能力：位置服务和人脸识别能力。

## 平台能力简介

- **位置服务**

  提供用户位置，EdgeGallery APP可以获取用户所在位置
  
  订阅和通知，提供电子围栏和区域拥塞状态事件
  
  区域状态，EdgeGallery APP根据平台提供的区域拥塞状态对下行数据做相应处理。
  
  获取位置信息流程分为三段：
  1. 首先从MRP发现服务，MEP返回所有服务或满足查询参数的服务信息。
  2. 模拟器基于服务地址访问API service，获得地理位置。模拟器中地址位置已内置静态地址192.0.2.1.
  3. EdgeGallery APP根据地址位置做其他处理

- **人脸识别**

  人脸上传，上传人脸图片
  人脸识别，上传人脸图片并进行识别
  视频人脸识别
  
  人脸识别流程分别以下三段：
  1. 上传人脸照片：要求只包含一个人脸信息、图片名即为人名、图片格式为png。
  2. 上传另一张人脸图像进行识别，返回人脸位置、识别的人脸信息。
  3. 对于摄像头中的人脸识别，输入摄像头的url，即可。
  
  **3.使用方法：** 
  登录EdgeGallery开发者平台：https://159.138.133.87:30092 。
  新建项目后会自动启动一个api-emulator容器，界面会弹出API详情，开发者输入参数直接调用api即可。
  
  - **制作镜像：** 推荐使用/docker/Dockerfile文件进行镜像的制作，Dockerfile文件需要与项目打包生成的target文件夹放在同一级目录中，否则无法找到可执行jar包和依赖项。
  使用命令`docker run build .` 构建镜像
  
- ### Kubernetes环境部署

  api-emulator提供了部署在Kubernetes环境的部署模板
  推荐使用/deploy/api-emulator.yaml文件进行部署，
  
