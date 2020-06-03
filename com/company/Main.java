package com.company;


import static com.company.Calculator.calculate;
import static com.company.Convert.intToRme;
import static com.company.Convert.romeToInt;

public class Main {
    private static final char exitCharacter = '!';

    public static void main(String[] args) {
        DataReader reader = new DataReader(exitCharacter);
        System.out.println("Input: ");
        while (true) {
            try {
                reader.read();
            } catch (RuntimeException e) {
                System.err.println(e.getMessage());
                continue;
            }
            if (reader.isExitFlag()) {
                System.out.println("Найден знак выхода: " + exitCharacter);
                System.out.println("Завершение программы");
                break;
            }
            int result = calculate(reader.getVar1(), reader.getVar2(), reader.getOper());
            System.out.println("Output: " + result);
        }
    }
    public static boolean checkNumRom (String a, String b){

        int num1 = romeToInt(a);
        int num2 = romeToInt(b);

        if((num1 > 0 && num1 <= 10) && (num2 > 0 && num2 <= 10)){
            return true;
        }else {
            return false;
        }
    }
    public static void romeCalculate(String a, int operation, String b){

        int num1 = romeToInt(a);
        int num2 = romeToInt(b);

        System.out.println(intToRme(calculate(num1, operation, num2)));
    }


}