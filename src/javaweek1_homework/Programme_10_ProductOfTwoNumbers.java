package javaweek1_homework;

/**
 * 10. Write a Java program that takes two numbers as input and display
 * the product of two numbers.
 * Test data:
 * Input first number: 25
 * Input second number: 5
 * Expected Out: 25 x 5 = 125
 */
public class Programme_10_ProductOfTwoNumbers {
    public static void main(String[] args) {
        //First Number declaration
        int firstNumber = 25;
        //Second number declaration
        int secondNumber = 5;
        int produced = firstNumber * secondNumber;
        //Expected output
        System.out.println(firstNumber + " x " + secondNumber + " = " + produced);
    }
}
