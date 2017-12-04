package com.kodilla.exception.test;

public class ExceptionHandling extends Exception {
    private SecondChallenge secondChallenge = new SecondChallenge();

    public void testFunction() {
        try {

            secondChallenge.probablyIWillThrowException(5, 6);

        } catch (Exception e) {

            System.out.println("There was a problem with variables");

        } finally {

            System.out.println("Done");

        }
    }
}
