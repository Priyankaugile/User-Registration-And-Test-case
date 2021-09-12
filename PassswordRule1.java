package com.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PassswordRule1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your password");
        String password = scan.next();

        validatePassword(password);
    }

    private static void validatePassword(String password) {
        String passwordRegex = "^[A-Za-z]{8,20}";
        Pattern pattern = Pattern.compile(passwordRegex);
        Matcher matcher = pattern.matcher(password);
        System.out.println("is valid password: " +matcher.matches());
    }
}
