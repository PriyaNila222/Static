package com.company;

//Write a class with 2 static variables, 2 instance variable, 2 static methods, 2 instance method and main method

public class Program1 {

    static int additionValue1 = 10;
    static int additionValue2 = 20;
    int subtractionValue1 = 50;
    int subtractionValue2 = 10;

    public static void main(String[] args) {
        int additionResult = addition(additionValue1,additionValue2);
        additionValue(additionResult);

        var object = new Program1();
        int subtractionResult = object.subtraction(object.subtractionValue1,object.subtractionValue2);
        object.subtractionValue(subtractionResult);
    }

    public static int addition (int value1, int value2) {
        int addition = value1 + value2;
        return addition;
    }

    public static void additionValue(int value) {
        System.out.println("Addition value: " + value);
    }

    public int subtraction (int value1, int value2) {
        int subtraction = value1 - value2;
        return subtraction;
    }

    public void subtractionValue(int value) {
        System.out.println("Subtraction value: " + value);
    }
}
