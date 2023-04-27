package com.doxalearn.PayrollManager;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Contractor implements Payable {
    private int hoursWorked;
    private double partsCost;
    private String name;

    public Contractor(int hoursWorked, double partsCost, String name) {
        this.hoursWorked = hoursWorked;
        this.partsCost = partsCost;
        this.name = name;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public double getPartsCost() {
        return partsCost;
    }

    public String getName() {
        return name;
    }

    @Override
    public double calculatePay() {
        int hourlyRate = 45;
        return hourlyRate * hoursWorked + partsCost;
    }

    @Override
    public String generatePayStub() { // invoice
        Address address = new Address("5 Emerald Close", "Kingston", "Kingston", "00000");
        Company company = new Company("ABC Company", address);

        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy");
        String strDate = format.format(date);

        String outStr = String.format("""
                \t\t\t%s
                \tTO: %s
                \tInvoice Date \t%s
                \tHour Worked %d
                \tCost of Parts $.2f
                \tTotal $%.2f
                                
                """, getName(), company.getName(), strDate, hoursWorked, partsCost, calculatePay());
        return outStr;
    }

    public static void printStub(String filePath, List<Contractor> contractors) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
            for (Contractor contractor : contractors) {
                writer.write(contractor.generatePayStub());
            }
        } catch (IOException e) {
            System.out.println("An error occurred printing the pay stubs");
            e.printStackTrace();
        }
    }
}
