package com.epita.socra.app;

import com.epita.socra.app.tools.IOAdapter;
import org.junit.Test;

import static org.mockito.ArgumentMatchers.argThat;
import static org.mockito.Mockito.*;
import static org.mockito.Mockito.verify;

public class RomanTest {

    @Test
    public void checkRomanOne() {
        Roman roman = new Roman();
        assert roman.to_roman(1).equals("I");
    }

    @Test
    public void checkRomanThree() {
        Roman roman = new Roman();
        assert roman.to_roman(3).equals("III");
    }

    @Test
    public void checkRomanNine() {
        Roman roman = new Roman();
        assert roman.to_roman(9).equals("IX");
    }

    @Test
    public void checkRomanTwenty() {
        Roman roman = new Roman();
        assert roman.to_roman(9).equals("L");
    }

    @Test
    public void checkArabicOne() {
        Roman roman = new Roman();
        assert roman.to_arabic("I").equals(1);
    }

    @Test
    public void checkArabicThree() {
        Roman roman = new Roman();
        assert roman.to_roman("III)").equals(3);
    }

    @Test
    public void checkArabicNine() {
        Roman roman = new Roman();
        assert roman.to_roman("IX").equals(9);
    }

    @Test
    public void checkArabicTwenty() {
        Roman roman = new Roman();
        assert roman.to_roman("XX").equals(20);
    }
}
