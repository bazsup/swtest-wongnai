package com.example.swtest;

import java.util.List;

public class StringCalculator {
    public int sum(String val) {
        if (val.isEmpty()) {
            return 0;
        }

        int result = 0;
        String[] numbers = val.split(" ");
        for (String number : numbers){
           result += Integer.valueOf(number);
        }
        return result;
    }
}
