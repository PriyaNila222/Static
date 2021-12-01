package com.company;

//Call instance methods in static methods

public class Program4 {
    public static void main(String[] args) {
        int value1 = 10;
        int value2 = 30;
        addition(value1,value2);
    }

    public static void addition(int value1, int value2) {
        int addition = value1 + value2;
        var object = new Program4();
        object.printValue(addition);
    }

    public void printValue(int value) {
        System.out.println("Addition value is: " + value);
    }

}
