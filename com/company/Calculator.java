package com.company;

public  class Calculator {

    Calculator(){}

    public static byte calculate(int var1, int var2, int operation){
        int result;
        if (operation == '+') {
            result = var1 + var2;
        } else if (operation == '-') {
            result = var1 - var2;
        } else if (operation == '*') {
            result = var1 * var2;
        } else if (operation == '/') {
            result = var1 / var2;
        } else {
            throw new IllegalArgumentException("Не верный знак операции");
        } if (var1 > 10 || var2 > 10) {
            throw new IllegalArgumentException("Доступны числа только от 1 до 10");
        }
        return (byte) result;
    }

}
