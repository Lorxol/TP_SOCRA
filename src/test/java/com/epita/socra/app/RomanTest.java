package com.epita.socra.app;

import com.epita.socra.app.tools.IOAdapter;
import org.junit.Test;

import static org.mockito.ArgumentMatchers.argThat;
import static org.mockito.Mockito.*;
import static org.mockito.Mockito.verify;

public class RomanTest {

    @Test
    public void checkOne() {
        Roman roman = new Roman();
        assert roman.to_roman(1).equals("I");
    }

    @Test
    public void checkThree() {
        Roman roman = new Roman();
        assert roman.to_roman(3).equals("III");
    }

    @Test
    public void checkNine() {
        Roman roman = new Roman();
        assert roman.to_roman(9).equals("IX");
    }

    @Test
    public void checkTwenty() {
        Roman roman = new Roman();
        assert roman.to_roman(20).equals("XX");
    }

    @Test
    public void checkTwentyFour() {
        Roman roman = new Roman();
        assert roman.to_roman(24).equals("XXIV");
    }

    @Test
    public void checkFifty() {
        Roman roman = new Roman();
        assert roman.to_roman(50).equals("L");
    }

    @Test
    public void checkFiftyNine() {
        Roman roman = new Roman();
        assert roman.to_roman(59).equals("LIX");
    }

    @Test
    public void checkNinetyNine() {
        Roman roman = new Roman();
        assert roman.to_roman(99).equals("XCIX");
    }

    @Test
    public void checkHundred() {
        Roman roman = new Roman();
        assert roman.to_roman(100).equals("C");
    }

    @Test
    public void checkFiveHundred() {
        Roman roman = new Roman();
        assert roman.to_roman(500).equals("D");
    }

    @Test
    public void checkThousand() {
        Roman roman = new Roman();
        assert roman.to_roman(1000).equals("M");
    }

    @Test
    public void checkTwoThousand() {
        Roman roman = new Roman();
        assert roman.to_roman(2000).equals("MM");
    }

    @Test
    public void checkThreeThousand() {
        Roman roman = new Roman();
        assert roman.to_roman(3000).equals("MMM");
    }
}
