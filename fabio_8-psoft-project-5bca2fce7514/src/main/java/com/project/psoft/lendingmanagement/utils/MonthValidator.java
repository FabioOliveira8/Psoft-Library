package com.project.psoft.lendingmanagement.utils;

public class MonthValidator {
    public static boolean isValidMonth(Integer month) {
        return month != null && month >= 1 && month <= 12;
    }
}
