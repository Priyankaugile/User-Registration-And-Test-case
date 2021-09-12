package com.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your phone number");
        String phoneNumber = scan.nextLine();

        validatePhoneNumber(phoneNumber);
    }

    public static boolean validatePhoneNumber(String phoneNumber) {
        String phoneRegex = "^[0-9]{2}\\s{1}[0-9]{10}";
        Pattern pattern = Pattern.compile(phoneRegex);
        Matcher matcher = pattern.matcher(phoneNumber);
        System.out.println("is valid phone number: " +matcher.matches());
        return matcher.matches();
    }


}

