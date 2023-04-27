package com.doxalearn.PayrollManager;

public class Address {

    private String street;
    private String city;
    private String province;
    private String zip;

    public Address(String street, String city, String province, String zip) {
        this.street = street;
        this.city = city;
        this.province = province;
        this.zip = zip;
    }

    public void getAddress() {
        String address = """
        Street: %s
        City: %s
        Province: %s
        Zip: %s""";
        System.out.printf(address, this.street, this.city, this.province, this.zip);
    }
}
