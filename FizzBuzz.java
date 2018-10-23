package com.github.vorago.basics;

import java.util.Random;

public class FizzBuzz {
    public static String check(int number) {
        String answer;
        if ((number % 5 == 0) && (number % 3 == 0)) {
            answer = "FizzBuzz";
        } else if ((number % 3 == 0) && (number % 5 != 0)) {
            answer = "Fizz";
        } else if ((number % 5 == 0) && (number % 3 != 0)) {
            answer = "Buzz";
        } else {
            answer = String.valueOf(number);
        }
        return answer;
    }
}