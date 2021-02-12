package com.haievskyi.array;

public class Main {

    public static void main(String[] args) {
        char charX = 'X';
        char charY = 'Y';
        int arraySize = 5;
        char[][] charsArray = generateArray(charX, charY, arraySize);

        printArrayToConsole(charsArray);
    }

    private static char[][] generateArray(char firstChar, char secondChar,
        int arraySize) {
        char[][] arrayResult = new char[arraySize][arraySize];

        for (int i = 0; i < arraySize; i++) {
            for (int j = 0; j < arraySize; j++) {
                arrayResult[i][j] = (j % 2 == 0) ? firstChar : secondChar;
            }
        }
        return arrayResult;
    }

    private static void printArrayToConsole(char[][] array) {
        String output = "[";

        for (int i = 0; i < array.length; i++) {
            output += "[";
            for (int j = 0; j < array.length; j++) {
                output += (j != array.length - 1)
                        ? array[i][j] + ", "
                        : array[i][j] + "]";
            }
            if (i != array.length - 1) {
                output += ", ";
            }
        }
        output += "]";
        System.out.println(output);
    }
}
