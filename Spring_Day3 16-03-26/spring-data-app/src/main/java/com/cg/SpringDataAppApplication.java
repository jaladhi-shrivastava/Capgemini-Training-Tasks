package com.cg;

import com.cg.entity.Employee;
import com.cg.repo.IEmployeeRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.time.LocalDate;

@SpringBootApplication
public class SpringDataAppApplication {

    public static void main(String[] args) {
        ApplicationContext ctx= SpringApplication.run(SpringDataAppApplication.class, args);
        IEmployeeRepo employeeRepo = ctx.getBean(IEmployeeRepo.class);
        employeeRepo.save(new Employee("Pragya", LocalDate.of(2004,8,6),560000 ));
        System.out.println("Employee created...");
    }

}
