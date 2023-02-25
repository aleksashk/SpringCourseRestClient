package com.philimonov.spring.rest;

import com.philimonov.spring.rest.configuration.MyConfig;
import com.philimonov.spring.rest.entity.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        Communication communication = context.getBean("communication", Communication.class);

//        List<Employee> allEmployees = communication.getAllEmployees();
//        System.out.println(allEmployees);

//        Employee empById = communication.getEmployee(1);
//        System.out.println(empById);

        Employee employee = new Employee("Garry", "Guddiny", "HR", 40000);
        employee.setId(9);
        communication.saveEmployee(employee);
    }
}
