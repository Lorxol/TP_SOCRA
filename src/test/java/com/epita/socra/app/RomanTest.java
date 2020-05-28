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
        assert roman.to_roman(9).equals("L");
    }
}
