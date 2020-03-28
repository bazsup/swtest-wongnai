package com.example.swtest;

import java.util.Scanner;

public class ConsoleIO implements IO {
    @Override
    public void print(String msg) {
        System.out.println(msg);
    }

    @Override
    public String getInput() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        return input;
    }
}
