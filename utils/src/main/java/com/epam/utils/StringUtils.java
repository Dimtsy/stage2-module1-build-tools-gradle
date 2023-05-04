package com.epam.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        try {
            Pattern pattern = Pattern.compile("0.+");
            Matcher matcher = pattern.matcher(str);
            if (matcher.find()) {
                return false;
            }
            System.out.println(Double.parseDouble(str));
            return Double.parseDouble(str) > 0;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
