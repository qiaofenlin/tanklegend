package com.yjg.tanklegend.properties;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "tankUser")
public class TankUserProperties {

    private String username;

    private  Integer passward;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getPassward() {
        return passward;
    }

    public void setPassward(Integer passward) {
        this.passward = passward;
    }
}
