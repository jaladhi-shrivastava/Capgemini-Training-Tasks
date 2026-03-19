package com.cg;

import com.cg.bean.Employee;
import com.cg.bean.SBU;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

@SpringBootApplication
@PropertySource("classpath:data.properties")
public class SpringAssignment1Application {

    public static void main(String[] args) {
        ApplicationContext ctx= SpringApplication.run(SpringAssignment1Application.class, args);

//        Employee e=ctx.getBean(Employee.class);
//        e.empDetail();
      //e.sbuDetail();



//        SBU sbu=ctx.getBean(SBU.class);
//        sbu.sbuDetail();
//        sbu.empList();



//====================Task4============================

        Scanner sc =new Scanner(System.in);
        System.out.println("Employee Id: ");
        int empid=sc.nextInt();
        SBU sbu=ctx.getBean(SBU.class);
        Employee emp=sbu.getEmpById(empid);
        if(emp != null) {
            System.out.println("=====Employee Info:=======");
            System.out.println("Employee ID : " + emp.getEmpid());
            System.out.println("Employee NAME : " + emp.getName());
            System.out.println("Employee SALARY : " + emp.getSalary());
        }
        else {
            System.out.println("Employee not found");
        }



    }
//====================Task3============================


    @Bean
    public Employee getBean1(){
//        -----------if we are not using constructors then we can use like below-----------
//        Employee e=new Employee();
//        e.setEmpid(1);
//        e.setName("Piyush");
//        e.setSalary(546600);
//        e.setAge(24);
//        return e;
//        ----------------if we are using constructors---------------
        return new Employee(101,"Rama",12345,"PES-BU",30);
    }

    @Bean
    public Employee getBean2(){
//        -----------if we are not using constructors then we can use like below-----------
//        Employee e=new Employee();
//        e.setEmpid(2);
//        e.setName("Ajay");
//        e.setSalary(660000);
//        e.setAge(44);
//        return e;
//        ----------------if we are using constructors---------------
        return new Employee(102,"Krishna",20000,"PES-BU",28);
    }




}
