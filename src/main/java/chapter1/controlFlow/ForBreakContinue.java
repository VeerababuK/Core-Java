package chapter1.controlFlow;

import chapter1.InputReader;

public class ForBreakContinue {
    public static void main(String[] args) {
        int targetVal = InputReader.readIntFromLine(); // you have to provide value from the console.

        // break
        for (int i = 0; i < 10; i++) {
            if (i == targetVal) {
                break;
            }
            System.out.println("Index value " + i);
        }

        System.out.println("----------------------------");

        // continue
        for (int i = 0; i < 10; i++) {
            if (i == targetVal) {
                continue;
            }
            System.out.println("Index value " + i);
        }
    }
}
