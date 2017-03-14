package com.flurgle.camerakit;

import android.graphics.YuvImage;
import android.hardware.Camera;

import java.io.File;

public abstract class CameraListener {

    public void onCameraOpened() {

    }

    public void onCameraClosed() {

    }

    public void onPictureTaken(byte[] jpeg, Camera.CameraInfo cameraInfo) {

    }

    public void onPictureTaken(YuvImage yuv, Camera.CameraInfo cameraInfo) {

    }

    public void onVideoTaken(File video) {

    }

}