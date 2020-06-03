package com.company;

import java.util.ArrayList;

public class Convert {

        static int romeToInt(String romeValue){
                int intValue = 0;
                int last = 0;

                ArrayList<String> romeList = new ArrayList<>();

                for (int i = 0; i <= 100; i++) {
                        romeList.add(i, "0");
                }

                romeList.set(1, "I");
                romeList.set(10, "X");
                romeList.set(100, "C");
                romeList.set(5, "V");
                romeList.set(50, "L");

                for (int i = romeValue.length(); i > 0 ; i--) {
                        String category = romeValue.substring(i-1, i);
                        int lastValue = romeList.indexOf(category);

                        if(lastValue >= last){
                                intValue += lastValue;
                        }else {
                                intValue -= lastValue;
                        }
                        last = lastValue;
                }
                return intValue;
        }

        static String intToRme(int value){
                StringBuilder result = new StringBuilder();

                while (value > 0){
                        if ((value/100) >= 1){
                                result.append("C");
                                value = value - 100;
                        }else if ((value/50) >= 1){
                                result.append("L");
                                value = value - 50;
                        }else if ((value/10) >= 1){
                                result.append("X");
                                value = value - 10;
                        }else {
                                switch ((value)) {
                                        case 9 -> {
                                                result.append("IX");
                                                value = value - 9;
                                        }
                                        case 8 -> {
                                                result.append("VIII");
                                                value = value - 8;
                                        }
                                        case 7 -> {
                                                result.append("VII");
                                                value = value - 7;
                                        }
                                        case 6 -> {
                                                result.append("VI");
                                                value = value - 6;
                                        }
                                        case 5 -> {
                                                result.append("V");
                                                value = value - 5;
                                        }
                                        case 4 -> {
                                                result.append("IV");
                                                value = value - 4;
                                        }
                                        case 3 -> {
                                                result.append("III");
                                                value = value - 3;
                                        }
                                        case 2 -> {
                                                result.append("II");
                                                value = value - 2;
                                        }
                                        case 1 -> {
                                                result.append("I");
                                                value = value - 1;
                                        }
                                }
                        }
                }

                if (value < 0) {
                        throw new IllegalArgumentException("Неверное число");
                }

                return result.toString();
        }

}