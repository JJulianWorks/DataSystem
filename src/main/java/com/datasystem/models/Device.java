package com.datasystem.models;

import java.time.LocalDate;

public class Device {

    private Integer idDevice;
    private Integer idClient;
    private String deviceType;
    private String brand;
    private String model;
    private String serialNumber;
    private LocalDate registerDate;
    private String observations;
    private String status;
    private String lastChange;
    private String testComments;
    private String techReviews;

    public Device(Integer idDevice, Integer idClient, String deviceType,
                  String brand, String model, String serialNumber,
                  LocalDate registerDate, String observations, String status,
                  String lastChange, String testComments, String techReviews) {
        this.idDevice = idDevice;
        this.idClient = idClient;
        this.deviceType = deviceType;
        this.brand = brand;
        this.model = model;
        this.serialNumber = serialNumber;
        this.registerDate = registerDate;
        this.observations = observations;
        this.status = status;
        this.lastChange = lastChange;
        this.testComments = testComments;
        this.techReviews = techReviews;
    }

    public Integer getIdDevice() {
        return idDevice;
    }

    public Integer getIdClient() {
        return idClient;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public LocalDate getRegisterDate() {
        return registerDate;
    }

    public String getObservations() {
        return observations;
    }

    public String getStatus() {
        return status;
    }

    public String getLastChange() {
        return lastChange;
    }

    public String getTestComments() {
        return testComments;
    }

    public String getTechReviews() {
        return techReviews;
    }
}
