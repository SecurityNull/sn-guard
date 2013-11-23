package com.securitynull.sn_guard.functions.device;

import android.os.Build;

/**
 * Created by Petrosyan on 20/11/13.
 */
public class DeviceManager {

    public DeviceManager() {
        super();
    }

    public Device getDeviceInformation() {
        Device device = new Device();

        device.setOsVersion(System.getProperty("os.version"));
        device.setApiLevel(String.valueOf(Build.VERSION.SDK_INT));
        device.setDeviceName(Build.DEVICE);
        device.setModelName(Build.MODEL);
        device.setDisplayName(Build.DISPLAY);

        if (Integer.parseInt(device.getApiLevel()) >= 9)
            device.setSerialNumber(Build.SERIAL);
        else
            device.setSerialNumber("Unsupported");

        if (Integer.parseInt(device.getApiLevel()) >= 8)
            device.setSerialNumber(Build.BOOTLOADER);
        else
            device.setSerialNumber("Unsupported");

        device.setManufacturer(Build.MANUFACTURER);
        device.setBoard(Build.BOARD);
        device.setBrand(Build.BRAND);
        device.setCpu_abi_1(Build.CPU_ABI);
        device.setCpu_abi_2(Build.CPU_ABI2);
        device.setFingerPrint(Build.FINGERPRINT);
        device.setHardware(Build.HARDWARE);

        return device;
    }
}
