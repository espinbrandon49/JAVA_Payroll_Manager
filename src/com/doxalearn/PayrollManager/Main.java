package com.doxalearn.PayrollManager;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Department dept1 = new Department("Accounting");
        Department dept2 = new Department("IT");
        Department dept3 = new Department("Sales");

        List<Department> departments = new ArrayList<>();
        departments.add(dept1);
        departments.add(dept2);
        departments.add(dept3);

        Address address = new Address("5 Emerald Close", "Kingston", "Kingston", "00000");

        Company abc = new Company("ABC Company", address, departments);

        SalariedEmployee emp1 = new SalariedEmployee("Bob Sawyer", 65000, dept1);
        SalariedEmployee emp2 = new SalariedEmployee("Jane White", 57000, dept2);
        SalariedEmployee emp3 = new SalariedEmployee("Joe Brown", 50000, dept3);
        SalariedEmployee emp4 = new SalariedEmployee("Sarah Thomas", 50000, dept3);
        SalariedEmployee emp5 = new SalariedEmployee("Alex Thomas", 40000, dept2);

        Employee[] employees = {emp1, emp2, emp3, emp4, emp5};

        List<Employee> employeeList = Arrays.asList(employees);

//        employeeList.stream().forEach(System.out::println);

        System.out.println("Employees grouped by Department");
        Map<String, List<Employee>> groupByDepartment =
                employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment));
        groupByDepartment.forEach(
                (department, employeesInDepartment) ->
                {
                    System.out.println(department);
                    employeesInDepartment.forEach(
                            employee -> System.out.printf("  %s%n", employee)
                    );
                }
        );

//        HourlyEmployee emp4 = new HourlyEmployee("Brandon Mikes", 40);
//        HourlyEmployee emp5 = new HourlyEmployee("Sarah Jones", 30);
//        HourlyEmployee emp6 = new HourlyEmployee("Bpb Sagat", 40);
//
//        Contractor con1 = new Contractor(100, 3000, "Bob's Big Boys");
//        Contractor con2 = new Contractor(43, 8000.54, "Royal Plumbing");
//
//        String fileName = "Paystubs.txt";
//
//        List<SalariedEmployee> employees = new ArrayList<>();
//        employees.add(emp1);
//        employees.add(emp2);
//        employees.add(emp3);
//
//        List<HourlyEmployee> hourlyEmployees = new ArrayList<>();
//        hourlyEmployees.add(emp4);
//        hourlyEmployees.add(emp5);
//        hourlyEmployees.add(emp6);
//
//        List<Contractor> contractors = new ArrayList<>();
//        contractors.add(con1);
//        contractors.add(con2);
//
//        SalariedEmployee.printStub(fileName, employees);
//        HourlyEmployee.printStub(fileName, hourlyEmployees);
//        Contractor.printStub(fileName, contractors);
    }
}
