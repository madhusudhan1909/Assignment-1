/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

public class PatternPrinting {
    public static void main(String[] args) {
        printPattern();
    }

    public static void printPattern() {
        int rows = 4;
        int columns = 4;

        // Print the pattern
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= columns; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}

