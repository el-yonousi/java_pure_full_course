package com.casetrue.for_loop_13;

public class Main {
    public static void main(String[] args) {
        /**
         * for loop = executes a block of code a limited amount of times
         * for keyword
         * int i = 1; declaration
         * i <= 10; condition
         * i++; step, increment/dicrement
         */

        for (int i = 1; i <= 10; i++) {
            System.out.printf("7 * %d = %d\n", i, i * 6);
        }
        
        System.out.println();

        for (int i = 10; i >= 1; i--) {
            System.out.printf("7 * %d = %d\n", i, i * 6);
        }
    }
}
