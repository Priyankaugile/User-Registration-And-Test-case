package com.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserEmail {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter user email");
        String email = scan.next();


        validateUserEmail(email);
    }

    public static boolean validateUserEmail(String email) {
        String emailRegex = "^[A-Za-z0-9]+([.+_-][a-z0-9]+)?@[a-z0-9]+.[a-z]{2,4}(.[a-z]{2,4})?$";
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(email);
        System.out.println("is valid: " +matcher.matches());
        return matcher.matches();
    }


}

