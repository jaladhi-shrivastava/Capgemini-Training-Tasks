package com.cg.main;

import com.cg.bean.Employee;
import com.cg.bean.SBU;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class EmployeeMain {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");


        Employee employee=(Employee)context.getBean("employee");
        employee.empDetail();

//
        ((ClassPathXmlApplicationContext)context).close();
    }
}
