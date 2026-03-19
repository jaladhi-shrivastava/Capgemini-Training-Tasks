package com.cg.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

//@Component
public class Employee {
//    @Value("${eid}")
    private int empid;
//    @Value("${name}")
    private String name;
//    @Value("${salary}")
    private double salary;
//    @Value("${bu}")
    private String BU;
//    @Value("${age}")
    private int age;
//    @Autowired
//    private SBU sbu;

//    public SBU getSbu() {
//        return sbu;
//    }
//
//    public void setSbu(SBU sbu) {
//        this.sbu = sbu;
//    }


    public Employee() {}
    public Employee(int empid, String name, double salary, String BU, int age) {
        this.empid = empid;
        this.name = name;
        this.salary = salary;
        this.BU = BU;
        this.age = age;
    }

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getBU() {
        return BU;
    }

    public void setBU(String BU) {
        this.BU = BU;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void empDetail(){
        System.out.println("Employee Details");
        System.out.println("------------------------");
        System.out.println("Employee [ empId= "+getEmpid()+", empName= "+getName()+", empSalary= "+getSalary()+", empAge= "+getAge()+"]");
//        System.out.println("Employee ID: " + getEmpid());
//        System.out.println("Employee Name: " + getName());
//        System.out.println("Employee Salary: " + getSalary());
//        System.out.println("Employee BU: " + getBU());
//        System.out.println("Employee Age: " + getAge());
    }

//    public void sbuDetail(){
//        System.out.print("SBU Details= ");
//        System.out.print("SBU [ sbuCode= "+sbu.getSbuId()+", sbuHead= "+sbu.getSbuHead()+", sbuName= "+sbu.getSbuName()+"]");
//    }


}
