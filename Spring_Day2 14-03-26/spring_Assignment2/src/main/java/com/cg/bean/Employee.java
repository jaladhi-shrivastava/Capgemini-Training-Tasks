package com.cg.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
    @Value("${empid}")
    private int empid;
    @Value("${name}")
    private String name;
    @Value("${salary}")
    private double salary;
    @Value("${bu}")
    private String BU;
    @Autowired
    private  SBU businessUnit;
    @Value("${age}")
    private int age;

public Employee(){

}
    public Employee(int empid, String name, double salary, String BU,SBU businessUnit, int age) {
        this.empid = empid;
        this.name = name;
        this.salary = salary;
        this.BU = BU;
        this.businessUnit = businessUnit;
        this.age = age;
    }

    public SBU getBusinessUnit() {
        return businessUnit;
    }

    public void setBusinessUnit(SBU businessUnit) {
        this.businessUnit = businessUnit;
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

    public void setBU( String  BU) {
        this.BU = BU;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee " +
                "empid=" + empid +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", businessUnit=" + businessUnit +
                ", age=" + age
                ;
    }

    public void empDetail(){
        System.out.println("Employee Details");
        System.out.println("------------------------");
        System.out.println("Employee ID: " + getEmpid());
        System.out.println("Employee Name: " + getName());
        System.out.println("Employee Salary: " + getSalary());
        System.out.println("Employee BU: " + getBU());
        System.out.println("Employee Age: " + getAge());
        System.out.println("Employee Business Unit: " + getBusinessUnit());
    }
}
