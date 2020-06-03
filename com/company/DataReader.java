package com.company;

import java.util.Scanner;

public class DataReader {
    private int var1;
    private int var2;
    private char oper;
    private boolean exitFlag;
    private final char exitCharacter;
    private final char resultChar;

    public DataReader(char exitCharacter) {
        this.exitCharacter = exitCharacter;
        this.resultChar = '=';
    }
    public void read() {
        Scanner scanner = new Scanner(System.in);
        new StringBuilder();
        String text = scanner.nextLine();
        if (text.indexOf(exitCharacter) != -1) {
            exitFlag = true;
            return;
        }
        try {
            if ((text.charAt(text.length() - 1) != resultChar)) {
                throw new RuntimeException();
            }

            text = text.substring(0, text.length() - 1);
            String[] blocks = text.split("[+-/*]");
            var1 = (int) Double.parseDouble(blocks[0]);
            oper = text.charAt(blocks[0].length());
            var2 = (int) Double.parseDouble(blocks[1]);
        } catch (RuntimeException e) {
            throw new IllegalArgumentException("Не верный формат данных");
        }
    }

    public byte getVar1() {
        return (byte) var1;
    }

    public byte getVar2() {
        return (byte) var2;
    }

    public char getOper() {
        return oper;
    }

    public boolean isExitFlag() {
        return exitFlag;
    }
}
