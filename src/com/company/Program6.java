package com.company;

//Print static, instance variables in main method

public class Program6 {
    static int staticValue = 10;
    int instanceValue = 20;

    public static void main(String[] args) {
        var object = new Program6();
        System.out.println("Static value declared is: " + staticValue);
        System.out.println("Instance value declared is: " + object.instanceValue);
    }
}
