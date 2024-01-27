package com.smu.mscda;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class CapitalizeMd5 {
    public static void main(String[] args) {
        System.out.println("This program will capitalize the input string and Generate MD5 Hex");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the input string:");
        String input=sc.nextLine();
        System.out.println("Capitalized String is: "+ StringUtils.capitalize(input));
        System.out.println("MD5 Hex is: "+ DigestUtils.md5Hex(input));
    }

    public static String initCapString(String input) {
        return StringUtils.capitalize(input);
    }

    public static String md5String(String input) {
        return DigestUtils.md5Hex(input);
    }
}