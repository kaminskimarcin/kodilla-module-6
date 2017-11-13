package com.kodilla.testing.calculator;

public class Calculator {
    private Integer a, b;

    public Calculator(Integer a, Integer b){
        this.a = a;
        this.b = b;
    }

    public Integer getA (){
        return a;
    }

    public Integer getB (){
        return b;
    }

    public int add() {
        return a + b;
    }

    public int substract() {
        return a - b;
    }


}
