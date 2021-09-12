package com.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LastName {
    public static void main(String[] args)  {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter last name");
        String lastName = scan.nextLine();

        validateLastName(lastName);
    }

    public static boolean validateLastName(String lastName) {
        String regex = "^[A-Z][a-z]{2,}";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(lastName);

        System.out.println("is valid last name: " + matcher.matches());
        return matcher.matches();

    }

}
