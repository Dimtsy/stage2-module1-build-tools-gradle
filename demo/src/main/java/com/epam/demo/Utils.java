package com.epam.demo;

import com.epam.utils.StringUtils;

import java.util.List;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
        if (args==null){
            throw new NullPointerException("args = null");
        }

        for (String s: args) {
            if(!StringUtils.isPositiveNumber(s)){
                return false;
            }
        }
        return true;
        //magic happens here
    }
}