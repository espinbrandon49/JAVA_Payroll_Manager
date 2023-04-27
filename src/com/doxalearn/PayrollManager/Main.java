package com.doxalearn.PayrollManager;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        SalariedEmployee emp1 = new SalariedEmployee("Bob Sawyer", 65000);
        SalariedEmployee emp2 = new SalariedEmployee("Jane White", 57000);
        SalariedEmployee emp3 = new SalariedEmployee("Joe Brown", 50000);

        HourlyEmployee emp4 = new HourlyEmployee("Brandon Mikes", 40);
        HourlyEmployee emp5 = new HourlyEmployee("Sarah Jones", 30);
        HourlyEmployee emp6 = new HourlyEmployee("Bpb Sagat", 40);

        Contractor con1 = new Contractor(100, 3000, "Bob's Big Boys");
        Contractor con2 = new Contractor(43, 8000.54, "Royal Plumbing");

        String fileName = "Paystubs.txt";

        List<SalariedEmployee> employees = new ArrayList<>();
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);

        List<HourlyEmployee> hourlyEmployees = new ArrayList<>();
        hourlyEmployees.add(emp4);
        hourlyEmployees.add(emp5);
        hourlyEmployees.add(emp6);

        List<Contractor> contractors = new ArrayList<>();
        contractors.add(con1);
        contractors.add(con2);

        SalariedEmployee.printStub(fileName, employees);
        HourlyEmployee.printStub(fileName, hourlyEmployees);
        Contractor.printStub(fileName, contractors);
    }
}
