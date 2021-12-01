package com.company;

//Print instance variable in static method

public class Program2 {
    int value = 10;

    public static void main(String[] args) {
        var object = new Program2();
        print(object.value);
    }

    public static void print(int value) {
        System.out.println("Value: " + value);
    }
}
