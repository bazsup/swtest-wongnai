package com.example.swtest;

import java.util.Scanner;

public class CustomIO implements IO {
    private RequestBinSender sender = new RequestBinSenderImpl();

    public void setSender(RequestBinSender sender) {
        this.sender = sender;
    }

    @Override
    public void print(String msg) {
        sender.send(msg);
    }

    @Override
    public String getInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
