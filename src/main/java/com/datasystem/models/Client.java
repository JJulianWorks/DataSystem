package com.datasystem.models;

public class Client {

    private Integer idClient;
    private String clientName;
    private String emailClient;
    private String phoneClient;
    private String clientDir;
    private String lastChange;

    public Client(Integer idClient, String clientName, String emailClient,
                  String phoneClient, String clientDir, String lastChange) {
        this.idClient = idClient;
        this.clientName = clientName;
        this.emailClient = emailClient;
        this.phoneClient = phoneClient;
        this.clientDir = clientDir;
        this.lastChange = lastChange;
    }

    public int getIdClient() {
        return idClient;
    }

    public String getClientName() {
        return clientName;
    }

    public String getEmailClient() {
        return emailClient;
    }

    public String getPhoneClient() {
        return phoneClient;
    }

    public String getClientDir() {
        return clientDir;
    }

    public String getLastChange() {
        return lastChange;
    }
}
