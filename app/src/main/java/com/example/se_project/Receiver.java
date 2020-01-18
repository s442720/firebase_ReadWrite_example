package com.example.se_project;

public class Receiver {
    private String id;
    private String username;
    private Boolean online;

    public Receiver(){}
    public Receiver(String id, String username, Boolean online) {
        this.id = id;
        this.username = username;
        this.online = online;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Boolean getOnline() {
        return online;
    }

    public void setOnline(Boolean online) {
        this.online = online;
    }
}
