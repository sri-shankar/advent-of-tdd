package org.advent2023.day1;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import org.junit.jupiter.api.Test;

public class CalibrationValueTest {

    @Test
    public void test_create_calibration_value() {
        CalibrationValue c1 = new CalibrationValue(14);
        assertThat(c1.getCalibrationValue(), equalTo(14));

        CalibrationValue c2 = new CalibrationValue(14);
        assertThat(c2.getCalibrationValue(), equalTo(14));

        CalibrationValue c3 = new CalibrationValue(42);
        assertThat(c3.getCalibrationValue(), equalTo(42));

        assertThat(c1.equals(c2), equalTo(true));
        assertThat(c1.equals(c3), equalTo(false));

        assertThat(c1.hashCode(), equalTo(c2.hashCode()));
        // Note it is ok for c3's hashCode to clash/not clash 
        //  with c1 hashCode so no test for that
    }

    @Test
    public void test_decode_calibration_value() {
        test_one_decode_calibration_value("1abc2", 12);        

        test_one_decode_calibration_value("pqr3stu8vwx", 38);        

        test_one_decode_calibration_value("a1b2c3d4e5f", 15);        

        test_one_decode_calibration_value("treb7uchet", 77);        
    }

    private void test_one_decode_calibration_value(String input, int expected) {
        CalibrationValue c12 = CalibrationValue.decode(input);
        assertThat(c12.getCalibrationValue(), equalTo(expected));
    }
}
