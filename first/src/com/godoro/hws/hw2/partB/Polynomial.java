package com.godoro.hws.hw2.partB;

public class Polynomial implements Function {

    private double[] coefficients;

    public Polynomial(double[] coefficients) {
        this.coefficients = coefficients;
    }

    public double[] getCoefficients() {
        return coefficients;
    }

    public void setCoefficients(double[] coefficients) {
        this.coefficients = coefficients;
    }

    
    @Override
    public double evaluate(double x) {
        // TODO Auto-generated method stub

        double result = 0;

        for (int i = 0; i < coefficients.length; i ++) {

            result += coefficients[i] * Math.pow(x, i); 
        }
        return result;
    }

    

}
