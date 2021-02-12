package com.haievskyi.array;

import java.util.function.BiConsumer;

public class Main {
    private final static char CHAR_X = 'X';
    private final static char CHAR_Y = 'Y';
    private final static int ARRAY_SIZE = 10;

    public static void main(String[] args) {
        char[][] charsArray = generateArray(CHAR_X, CHAR_Y, ARRAY_SIZE);

        printArrayToConsole(charsArray);
    }

    private static char[][] generateArray(char firstChar, char secondChar,
            int arraySize) {

        char[][] array = new char[arraySize][arraySize];

        iterateArray(array, ((i, j) ->
                array[i][j] = (j % 2 == 0) ? firstChar : secondChar
        ));

        return array;
    }

    private static void printArrayToConsole(char[][] array) {

        iterateArray(array, ((i, j) -> {
            System.out.print(array[i][j] + " ");
            if ((j + 1) % ARRAY_SIZE == 0) {
                System.out.println();
            }
        }));
    }

    private static void iterateArray(char[][] array,
            BiConsumer<Integer, Integer> handler) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                handler.accept(i, j);
            }
        }
    }
}
