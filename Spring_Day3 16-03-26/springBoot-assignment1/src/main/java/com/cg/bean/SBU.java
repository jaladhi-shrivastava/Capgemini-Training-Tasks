package com.cg.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SBU {
    @Value("${sbuId}")
    private String sbuId;
    @Value("${sbuName}")
    private String sbuName;
    @Value("${sbuHead}")
    private String sbuHead;
    @Autowired
    private List<Employee> empList;

    public SBU (){}
    public SBU(String sbuId, String sbuName, String sbuHead, List<Employee> empList) {
        this.sbuId = sbuId;
        this.sbuName = sbuName;
        this.sbuHead = sbuHead;
        this.empList = empList;
    }

    public List<Employee> getEmpList() {
        return empList;
    }

    public void setEmpList(List<Employee> empList) {
        this.empList = empList;
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

    public void sbuDetail(){
        System.out.print("SBU Details= ");
        System.out.print("SBU [ sbuCode= "+ getSbuId()+", sbuHead= "+ getSbuHead()+", sbuName= "+ getSbuName()+"]");
        System.out.println();
    }

    public void empList(){
        for(Employee e:empList){
            System.out.println("Employee [ empId= "+e.getEmpid()+", empName= "+e.getName()+", empSalary= "+e.getSalary()+", empAge= "+e.getAge()+"]");
        }
    }

    public Employee getEmpById(int empId){
        for(Employee e:empList){
            if(e.getEmpid()==empId){
                return e;
            }
        }
        return null;
    }
}
