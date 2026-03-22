package com.cg.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Trainee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int tId;
    private String tName;
    private String tDomain;
    private String tLocation;

    public Trainee(){}

    public Trainee(String tName, String tDomain, String tLocation) {
        this.tName = tName;
        this.tDomain = tDomain;
        this.tLocation = tLocation;
    }

    public int gettId() {
        return tId;
    }

    public void settId(int tId) {
        this.tId = tId;
    }

    public String gettName() {
        return tName;
    }

    public void settName(String tName) {
        this.tName = tName;
    }

    public String gettDomain() {
        return tDomain;
    }

    public void settDomain(String tDomain) {
        this.tDomain = tDomain;
    }

    public String gettLocation() {
        return tLocation;
    }

    public void settLocation(String tLocation) {
        this.tLocation = tLocation;
    }
}
