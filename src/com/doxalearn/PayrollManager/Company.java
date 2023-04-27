package com.doxalearn.PayrollManager;

import java.util.List;

public class Company {
    private String name;
    private Address address;
    private List<Department> departments;

    public Company(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public Company(String name, Address address, List<Department> departments) {
        this.name = name;
        this.address = address;
        this.departments = departments;
    }

    public String getName() {
        return name;
    }

    public void getAddress() {
        address.getAddress();
    }

    public List<Department> getDepartments() {
        return departments;
    }
}
