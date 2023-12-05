package org.advent2023.day1;

import java.util.regex.Matcher;

import org.apache.commons.lang3.RegExUtils;

// This class contains some utility methods
public class Utils {

    public static String removeAllNonNumericChars(String string) {
                String numericString = RegExUtils.removeAll(string, "[^0-9]");

        return numericString;
    }

    public static int extractFirstDigitFromNumericString(String string) {
        raiseExceptionIfInputIsNotNumeric(string);
        return Integer.parseInt(string.substring(0,1));
    }

    public static int extractLastDigitFromNumericString(String string) {
         raiseExceptionIfInputIsNotNumeric(string);
        return Integer.parseInt(string.substring(string.length()-1,string.length()));
    }

    private static void raiseExceptionIfInputIsNotNumeric(String string) {
        Matcher matcher = RegExUtils.dotAllMatcher("[0-9]+", string);
        if (!matcher.matches()) {
            throw new RuntimeException("Error : expected string with 0-9 digits only");
        }
        if (string.length() == 0) {
            throw new RuntimeException("Error : expected string with atleast one 0-9 digit");
        }
    }


}
