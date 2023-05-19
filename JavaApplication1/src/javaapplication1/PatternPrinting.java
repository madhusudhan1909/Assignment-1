/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

public class PatternPrinting {
    public static void main(String[] args) {
        printINEURON();
    }

    public static void printINEURON() {
        int size = 7;
        int mid = size / 2;
        int i, j;
        
        // Pattern for 'I'
        for (i = 0; i < size; i++) {
            for (j = 0; j < size; j++) {
                if (j == mid)
                    System.out.print("I");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        
        System.out.println();
        
        // Pattern for 'N'
        for (i = 0; i < size; i++) {
            for (j = 0; j < size; j++) {
                if (j == 0 || j == size - 1 || i == j)
                    System.out.print("N");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        
        System.out.println();
        
        // Pattern for 'E'
       for (i = 0; i < size; i++) {
            for (j = 0; j < size; j++) {
               if (i == 0 || i == size - 1 || i == size / 2 || j == 0)
                    System.out.print("E");
               
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        
        System.out.println();
        
        // Pattern for 'U'
        for (i = 0; i < size; i++) {
            for (j = 0; j < size; j++) {
                if ((j == 0 || j == size - 1) && i != size - 1 || i == size - 1 && (j > 0 && j < size - 1))
                    System.out.print("U");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        
        System.out.println();
        
        // Pattern for 'R'
       for (i = 0; i < size; i++) {
            for (j = 0; j < size; j++) {
                if (j == 0 || (i == 0 || i == mid) && j < size - 1 || (i == j && i > mid) || (j == size - 1 && i > 0 && i < mid))
                    System.out.print("R");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        
        System.out.println();
        
        // Pattern for 'O'
        for (i = 0; i < size; i++) {
            for (j = 0; j < size; j++) {
                if ((j == 0 || j == size - 1) && (i != 0 && i != size - 1) || (i == 0 || i == size - 1) && (j > 0 && j < size - 1))
                    System.out.print("O");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        
        System.out.println();
        
        // Pattern for 'N'
        for (i = 0; i < size; i++) {
            for (j = 0; j < size; j++) {
                if (j == 0 || j == size - 1 || i == j)
                    System.out.print("N");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
