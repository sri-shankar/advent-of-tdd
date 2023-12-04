package org.advent2023.day1;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class UtilsTest {

    @Test
    public void test_remove_non_numeric_chars_from_string(){
        assertThat(Utils.removeAllNonNumericChars("123"), equalTo("123"));
        assertThat(Utils.removeAllNonNumericChars("abAsdc"), equalTo(""));
        assertThat(Utils.removeAllNonNumericChars("1s2d3"), equalTo("123"));
        assertThat(Utils.removeAllNonNumericChars("a123"), equalTo("123"));
        assertThat(Utils.removeAllNonNumericChars("123a"), equalTo("123"));
        assertThat(Utils.removeAllNonNumericChars(".123sd//"), equalTo("123"));
        assertThat(Utils.removeAllNonNumericChars("1abc2"), equalTo("12"));
        assertThat(Utils.removeAllNonNumericChars("pqr3stu8vwx"), equalTo("38"));
        assertThat(Utils.removeAllNonNumericChars("a1b2c3d4e5f"), equalTo("12345"));
        assertThat(Utils.removeAllNonNumericChars("treb7uchet"), equalTo("7"));
    }

    @Test
    public void test_extract_first_digit_from_numeric_string() {
        assertThrows(RuntimeException.class,()->Utils.extractFirstDigitFromNumericString("treb7uchet"));
             assertThrows(RuntimeException.class,()->Utils.extractFirstDigitFromNumericString(""));
   assertThat(Utils.extractFirstDigitFromNumericString("7"),equalTo(7));
        assertThat(Utils.extractFirstDigitFromNumericString("78"),equalTo(7));
        assertThat(Utils.extractFirstDigitFromNumericString("789"),equalTo(7));
        assertThat(Utils.extractFirstDigitFromNumericString("798"),equalTo(7));
    }

    @Test
    public void test_extract_last_digit_from_numeric_string() {
        assertThrows(RuntimeException.class,()->Utils.extractLastDigitFromNumericString("treb7uchet"));
        assertThrows(RuntimeException.class,()->Utils.extractLastDigitFromNumericString(""));

        assertThat(Utils.extractLastDigitFromNumericString("7"),equalTo(7));
        assertThat(Utils.extractLastDigitFromNumericString("78"),equalTo(8));
        assertThat(Utils.extractLastDigitFromNumericString("789"),equalTo(9));
        assertThat(Utils.extractLastDigitFromNumericString("798"),equalTo(8));
    }


}
