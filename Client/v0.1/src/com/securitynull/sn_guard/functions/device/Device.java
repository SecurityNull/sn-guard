package com.securitynull.sn_guard.functions.device;

/**
 * Created by Petrosyan on 20/11/13.
 */
public class Device {

    private String osVersion;
    private String apiLevel;
    private String deviceName;
    private String modelName;
    private String displayName;
    private String serialNumber;
    private String bootLoaderVersion;
    private String manufacturer;
    private String board;
    private String brand;
    private String cpu_abi_1;
    private String cpu_abi_2;
    private String fingerPrint;
    private String hardware;

    public Device() {
        super();
    }

    public Device(String osVersion, String apiLevel, String deviceName, String modelName, String displayName, String serialNumber, String bootLoaderVersion, String manufacturer, String board, String brand, String cpu_abi_1, String cpu_abi_2, String fingerPrint, String hardware) {
        super();

        this.osVersion = osVersion;
        this.apiLevel = apiLevel;
        this.deviceName = deviceName;
        this.modelName = modelName;
        this.displayName = displayName;
        this.serialNumber = serialNumber;
        this.bootLoaderVersion = bootLoaderVersion;
        this.manufacturer = manufacturer;
        this.board = board;
        this.brand = brand;
        this.cpu_abi_1 = cpu_abi_1;
        this.cpu_abi_2 = cpu_abi_2;
        this.fingerPrint = fingerPrint;
        this.hardware = hardware;
    }

    public String getOsVersion() {
        return osVersion;
    }

    public void setOsVersion(String osVersion) {
        this.osVersion = osVersion;
    }

    public String getApiLevel() {
        return apiLevel;
    }

    public void setApiLevel(String apiLevel) {
        this.apiLevel = apiLevel;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getBootLoaderVersion() {
        return bootLoaderVersion;
    }

    public void setBootLoaderVersion(String bootLoaderVersion) {
        this.bootLoaderVersion = bootLoaderVersion;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getBoard() {
        return board;
    }

    public void setBoard(String board) {
        this.board = board;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCpu_abi_1() {
        return cpu_abi_1;
    }

    public void setCpu_abi_1(String cpu_abi_1) {
        this.cpu_abi_1 = cpu_abi_1;
    }

    public String getCpu_abi_2() {
        return cpu_abi_2;
    }

    public void setCpu_abi_2(String cpu_abi_2) {
        this.cpu_abi_2 = cpu_abi_2;
    }

    public String getFingerPrint() {
        return fingerPrint;
    }

    public void setFingerPrint(String fingerPrint) {
        this.fingerPrint = fingerPrint;
    }

    public String getHardware() {
        return hardware;
    }

    public void setHardware(String hardware) {
        this.hardware = hardware;
    }
}
