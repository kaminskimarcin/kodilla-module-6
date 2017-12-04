package com.kodilla.exception.test;

public class SecondChallengeExceptionRunner {
    public static void main(String[] args) {
        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            secondChallenge.probablyIWillThrowException(5, 6);
        } catch (ExceptionHandling e) {
            System.out.println("There was a problem with variables, try another values");
        } finally {
            System.out.println("Done!");
        }
    }
}
