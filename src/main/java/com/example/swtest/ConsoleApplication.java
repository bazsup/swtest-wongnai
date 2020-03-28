package com.example.swtest;

import java.util.Scanner;

public class ConsoleApplication {
    static IO io = new CustomIO();

    public static void main(String[] args) {
        String input = io.getInput();

        StringCalculator calc = new StringCalculator();
        int result = calc.sum(input);

        String msg = String.format(
                "The result is: %d",
                result);
        io.print(msg);
    }
}
