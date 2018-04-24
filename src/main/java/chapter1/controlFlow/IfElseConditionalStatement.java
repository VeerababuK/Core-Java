package chapter1.controlFlow;

import chapter1.InputReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IfElseConditionalStatement {
    public static void main(String[] args) {
        int oldX = 10;

        String intValue = InputReader.readLine(); // you have to provide value from the console.

        int x = Integer.parseInt(intValue);
        if (x != oldX) {
            System.out.println("x was changed");
        } else {
            System.out.println("x was unchanged");
        }
    }
}
