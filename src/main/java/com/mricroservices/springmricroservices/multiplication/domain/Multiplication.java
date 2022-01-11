package com.mricroservices.springmricroservices.multiplication.domain;

public class Multiplication {

    private int factorA;
    private int factorB;

    private int result;

    public Multiplication(int factorA, int factorB){
        this.factorA = factorA;
        this.factorB = factorB;
        this.result = factorA * factorB;
    }

    public int getFactorA() {
        return factorA;
    }

    public int getFactorB() {
        return factorB;
    }

    public int getResult() {
        return result;
    }

    @Override
    public String toString() {
        return "Multiplcaion{" + "factorA = " + factorA + "factorB = " + factorB + " result(A*B)= " + result ;
    }
}
