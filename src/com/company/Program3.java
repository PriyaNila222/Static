package com.company;

//Print static variables in instance method

public class Program3 {
    static String name = "Priya";

    public static void main(String[] args) {
        var object = new Program3();
        object.print(name);
    }

    public void print(String name) {
        System.out.println("Name: " + name);
    }

}
