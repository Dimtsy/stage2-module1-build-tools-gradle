package com.epam.utils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
//        try {
//            boolean d = Double.parseDouble(str) > 0;
//        } catch (NumberFormatException e) {
//            e.getMessage();
//        }
        return Double.parseDouble(str) > 0;
        //here magic will happen
    }
}
