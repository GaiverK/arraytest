package com.haievskyi.array;

/**
 * Generate an array with a sequence of characters and a given size
 */
public class Main {
    public static void main(String[] args) {
        int arraySize = 2;
        char charX = 'X';
        char charY = 'Y';
        char[] charsSequence = generateArray(charX, charY, arraySize);
        printArrayToConsole(charsSequence);
    }

    /**
     * Generate array with chars sequence
     *
     * @param firstChar  - first char for sequence
     * @param secondChar - second char for sequence
     * @param arraySize  - array capacity
     * @return generated array with chars sequence
     */
    private static char[] generateArray(char firstChar, char secondChar,
            int arraySize) {
        char[] arrayResult = new char[arraySize];
        for (int i = 0; i < arraySize; i++) {
            arrayResult[i] = (i % 2 == 0) ? firstChar : secondChar;
        }
        return arrayResult;
    }

    /**
     * Print array to console
     *
     * @param charsSequence - char[] array with chars
     */
    private static void printArrayToConsole(char[] charsSequence) {
        String output = "[";
        for (int i = 0; i <= charsSequence.length - 1; i++) {
            output += (i == charsSequence.length - 1) ?
                    charsSequence[i] :
                    charsSequence[i] + ", ";
        }
        output += "]";
        System.out.println(output);
    }
}
