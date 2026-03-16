package com.cg;

import com.cg.bean.Employee;
import com.cg.bean.HelloWorld;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:data.properties")
public class FirstAppSpringBootApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(FirstAppSpringBootApplication.class, args);
        Employee emp = ctx.getBean(Employee.class);
        emp.printEmployeeDetails();

    }

}
