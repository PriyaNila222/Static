package com.company;

//Call static methods and instance methods in main method

public class Program7 {
    public static void main(String[] args) {
        int value1 = 50;
        int value2 = 10;

        int additionResult = addtition(value1, value2);
        System.out.println("Addition value: " + additionResult);

        var object = new Program7();
        int subtractionResult = object.subtraction(value1, value2);
        System.out.println("Subtraction value: " + subtractionResult);
    }

    public static int addtition(int value1, int value2) {
        int result = value1 + value2;
        return result;
    }

    public int subtraction(int value1, int value2) {
        int result = value1 - value2;
        return result;
    }
}
