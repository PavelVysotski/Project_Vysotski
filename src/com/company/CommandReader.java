package com.company;

import java.util.Scanner;

public class CommandReader {
    private static final Scanner scan = new Scanner(System.in);

    public static int readNumber(String message) {
        System.out.print(message);
        return Integer.parseInt(scan.nextLine());
    }

    public static String readString(String message) {
        System.out.print(message);
        return scan.nextLine();
    }

}
