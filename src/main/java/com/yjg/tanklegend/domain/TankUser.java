package com.yjg.tanklegend.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class TankUser {

    @Id
    @GeneratedValue
    private Integer id;

    private String username;

    private  Integer passward;

    public TankUser() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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
