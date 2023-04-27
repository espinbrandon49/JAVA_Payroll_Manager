package com.doxalearn.PayrollManager;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class HourlyEmployee extends Employee {
    private int hoursWorked;

    public HourlyEmployee(String name) {
        super(name);
    }

    public HourlyEmployee(String name, int hours) {
        super(name);
        this.hoursWorked = hours;
    }

    @Override
    public double calculatePay() {
        return this.hoursWorked * getPayRate();
    }

    @Override
    public String generatePayStub() {
        Address address = new Address("5 Emerald Close", "Kingston", "Kingston", "00000");
        Company company = new Company("ABC Company", address);

        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy");
        String strDate = format.format(date);

        String outStr = String.format("""
                \t\t\t%s
                \tName: %s - EmployeeId: %d
                \tPay Date \t%s
                \tPay rate $%.2f
                \tHour Worked %d
                \tNet Salary $%.2f
                
                """, company.getName(), getName(), getEMPLOYEE_ID(), strDate, getPayRate(), hoursWorked, calculatePay());
        return outStr;
    }

    public static void printStub(String filePath, List<HourlyEmployee> employees) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
            for (HourlyEmployee employee : employees) {
                writer.write(employee.generatePayStub());
            }
        } catch (IOException e) {
            System.out.println("An error occurred printing the pay stubs");
            e.printStackTrace();
        }
    }
}
