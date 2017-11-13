package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");
        Calculator calculator = new Calculator(5, 6);

        String result = simpleUser.getUsername();
        Integer substractResult = calculator.getA() - calculator.getB();
        Integer addResult = calculator.getA() + calculator.getB();

        if (result.equals("theForumUser")) {
            System.out.println("Test OK");
        } else {
            System.out.println("Error!");
        }

        // calculator test

        if (calculator.getA() != null && calculator.getB() != null) {
            System.out.println("Calculator test OK!");
        } else {
            System.out.println("Calculator error!");
        }

        // substraction test

        if (substractResult.equals(calculator.substract())) {
            System.out.println("Substraction test Ok!");
        } else {
            System.out.println("Substraction test error!");
        }

        // Add test

        if (addResult.equals(calculator.add())) {
            System.out.println("Add test Ok!");
        } else {
            System.out.println("Add test error!");
        }
    }
}
