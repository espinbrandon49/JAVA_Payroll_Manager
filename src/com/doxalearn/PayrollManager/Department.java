package com.doxalearn.PayrollManager;

import java.util.ArrayList;

public class Department {
    private String name;
    private ArrayList<Employee> employees;

    public Department(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return name;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }


}
