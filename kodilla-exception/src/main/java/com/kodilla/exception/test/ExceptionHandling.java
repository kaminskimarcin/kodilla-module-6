package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main(String[] args) {

        SecondChallenge secondChallenge = new SecondChallenge();

        try {

            secondChallenge.probablyIWillThrowException(5, 6);

        } catch(Exception e) {

            System.out.println("There was a problem with variables");

        } finally {
            System.out.println("Done!");
        }
    }
}
