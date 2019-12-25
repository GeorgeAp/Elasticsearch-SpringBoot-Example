package com.microlcafe.elasticsearchspringbootexample.domain;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class User {
    private String userId;
    private String name;
    private java.util.Date creationDate = new Date();
    private Map<String, String> userSetting = new HashMap<>();

    public User(String userId, String name, Date creationDate, Map<String, String> userSetting) {
        this.userId = userId;
        this.name = name;
        this.creationDate = creationDate;
        this.userSetting = userSetting;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Map<String, String> getUserSetting() {
        return userSetting;
    }

    public void setUserSetting(Map<String, String> userSetting) {
        this.userSetting = userSetting;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", name='" + name + '\'' +
                ", creationDate=" + creationDate +
                ", userSetting=" + userSetting +
                '}';
    }
}
