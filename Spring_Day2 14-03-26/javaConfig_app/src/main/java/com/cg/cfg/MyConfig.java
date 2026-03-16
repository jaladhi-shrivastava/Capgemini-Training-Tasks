package com.cg.cfg;

import com.cg.bean.Address;
import com.cg.bean.Employee;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class MyConfig {
    @Bean("emp")
    @Scope("prototype")
    public Employee getEmpDetail(){
        Employee e=new Employee();

        e.setEmpid(56);
        e.setName("Pragya");
        e.setAddress(new Address("Rudrapur","India",263153L));
        e.printEmployeeDetails();
        return e;
    }
}
