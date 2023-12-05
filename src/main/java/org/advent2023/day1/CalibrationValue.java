package org.advent2023.day1;

import org.apache.commons.lang3.RegExUtils;
import org.apache.commons.lang3.StringUtils;

public class CalibrationValue {

    private int calibrationValue;

    public CalibrationValue(int calibrationValue) {
        this.calibrationValue = calibrationValue;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + calibrationValue;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        CalibrationValue other = (CalibrationValue) obj;
        if (calibrationValue != other.calibrationValue)
            return false;
        return true;
    }

    public int getCalibrationValue() {
        return calibrationValue;
    }

    public static CalibrationValue decode(String cvString) {
        String numericString = Utils.removeAllNonNumericChars(cvString);
        int firstDigit = Utils.extractFirstDigitFromNumericString(numericString);
        int lastDigit = Utils.extractLastDigitFromNumericString(numericString);
        
        CalibrationValue cv = new CalibrationValue(10*firstDigit+lastDigit);
        return cv;
    }
    
    
    
}
