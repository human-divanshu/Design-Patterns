package com.thejavauniversity.designpatterns.composite;

import java.util.ArrayList;
import java.util.List;

public class Manager implements Employee {

    String name;
    List<Employee> employeeList = new ArrayList<>();

    Manager(String name) {
        this.name = name;
    }

    @Override
    public void showDetails() {
        System.out.println("Manager name = " + this.name);
        for(Employee e : employeeList) {
            e.showDetails();
        }
    }

    public void addEmployee(Employee e) {
        employeeList.add(e);
    }
}
