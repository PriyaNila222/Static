package com.company;

//Call static methods in instance method

public class Program5 {
    public static void main(String[] args) {
        String company = "JALA";
        var object = new Program5();
        object.fullName(company);
    }

    public void fullName(String company) {
        String companyName = company + "Technologies";
        print(companyName);
    }

    public static void print(String companyName) {
        System.out.println("Company name is: " + companyName);
    }
}
