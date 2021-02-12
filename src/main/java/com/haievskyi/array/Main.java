package com.haievskyi.array;

public class Main {

    public static void main(String[] args) {
        int arraySize = 10;
        char charX = 'X';
        char charY = 'Y';
        char[] charsSequence = generateArray(charX, charY, arraySize);

        printArrayToConsole(charsSequence);
    }

    private static char[] generateArray(char firstChar, char secondChar,
            int arraySize) {
        char[] arrayResult = new char[arraySize];

        for (int i = 0; i < arraySize; i++) {
            arrayResult[i] = (i % 2 == 0) ? firstChar : secondChar;
        }
        return arrayResult;
    }

    private static void printArrayToConsole(char[] charsSequence) {
        String output = "[";

        for (int i = 0; i < charsSequence.length; i++) {
            output += (i != charsSequence.length - 1)
                    ? charsSequence[i] + ", "
                    : charsSequence[i] + "]";
        }
        System.out.println(output);
    }
}
