package com.epam.demo;

import com.epam.utils.StringUtils;

import java.util.List;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
        try {
            for (String s : args) {
                if (!StringUtils.isPositiveNumber(s)) {
                    return false;
                }
            }
        } catch (NullPointerException e) {
            return false;
        }
        return true;
    }
}