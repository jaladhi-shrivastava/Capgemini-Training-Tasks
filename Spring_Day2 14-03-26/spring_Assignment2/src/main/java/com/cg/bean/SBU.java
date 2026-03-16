package com.cg.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class SBU {
    @Value("${sbuId}")
    private String sbuId;
    @Value("${sbuName}")
    private String sbuName;
    @Value("${sbuHead}")
    private String sbuHead;


    public SBU(){}
    public SBU(String sbuId, String sbuName, String sbuHead) {
        this.sbuId = sbuId;
        this.sbuName = sbuName;
        this.sbuHead = sbuHead;
    }

    public String getSbuId() {
        return sbuId;
    }

    public void setSbuId(String sbuId) {
        this.sbuId = sbuId;
    }

    public String getSbuName() {
        return sbuName;
    }

    public void setSbuName(String sbuName) {
        this.sbuName = sbuName;
    }

    public String getSbuHead() {
        return sbuHead;
    }

    public void setSbuHead(String sbuHead) {

        this.sbuHead = sbuHead;
    }


    @Override
    public String toString() {
        return "SBU: " +
                "sbuId='" + sbuId + '\'' +
                ", sbuName='" + sbuName + '\'' +
                ", sbuHead='" + sbuHead + '\'' ;
    }

    public void sbuDetails() {
        System.out.println("SBU Details");
        System.out.println("------------------------");
        System.out.println("SBU ID: " + getSbuId());
        System.out.println("SBU Name: " + getSbuName());
        System.out.println("SBU Head: " + getSbuHead());


    }
}
