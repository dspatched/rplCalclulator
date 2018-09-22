package com.company;

public class Main {

    public static void main(String[] args) {
        String input1 = "-15-(-4/0)*(-8)";
        String input2 = "7*6/2+8";
        String input3 = "(1+38)*4-5";
        String input4 = "-12)1//(";
        String input5 = "10/3";
        Calculator calc = new Calculator();

        System.out.println(calc.evaluate(input1));
        System.out.println(calc.evaluate(input2));
        System.out.println(calc.evaluate(input3));
        System.out.println(calc.evaluate(input4));
        System.out.println(calc.evaluate(input5));
    }
}
