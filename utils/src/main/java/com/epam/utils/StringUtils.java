package com.epam.utils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        return str != null && Double.parseDouble(str) > 0;
        //here magic will happen
    }
}
