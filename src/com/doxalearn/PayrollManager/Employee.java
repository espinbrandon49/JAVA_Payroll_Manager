package com.doxalearn.PayrollManager;

public abstract class Employee implements Payable {
    private String name;
    private double payRate;
    private final int EMPLOYEE_ID;
    private Address address;
    private Department department;
    private static int nextId;
    public static double STARTING_PAY_RATE = 7.75;

    public Employee(String name) {
        this.name = name;
        this.EMPLOYEE_ID = getNextId();
        payRate = STARTING_PAY_RATE;
    }

    public Employee(String name, double pay) {
        this.name = name;
        this.payRate = pay;
        this.EMPLOYEE_ID = getNextId();
        payRate = STARTING_PAY_RATE;
    }

    public String getName() {
        return name;
    }

    public int getEMPLOYEE_ID() {
        return EMPLOYEE_ID;
    }

    public double getPayRate() {
        return payRate;
    }

    public void changeName(String name) {
        this.name = name;
    }

    public void changePayRate(double payRate) {
        this.payRate = payRate;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void displayAddress() {
        address.getAddress();
    }

    public static int getNextId() {
        int id = nextId;
        nextId++;
        return id;
    }

}
