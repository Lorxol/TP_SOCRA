package com.epita.socra.app;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.ArgumentMatchers.argThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.epita.socra.app.tools.IOAdapter;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test.
     */
    @Test
    public void checkOne() {
        IOAdapter mock = mock(IOAdapter.class);
        when(mock.read()).thenReturn("1");
        App app = new App(mock);
        app.run();

        verify(mock).write("Type a number:");
        verify(mock).write(argThat(message -> message.contains("I")));

    }

    @Test
    public void checkThree() {
        IOAdapter mock = mock(IOAdapter.class);
        when(mock.read()).thenReturn("3");
        App app = new App(mock);
        app.run();

        verify(mock).write("Type a number:");
        verify(mock).write(argThat(message -> message.contains("III")));

    }

    @Test
    public void check() {
        IOAdapter mock = mock(IOAdapter.class);
        when(mock.read()).thenReturn("3");
        App app = new App(mock);
        app.run();

        verify(mock).write("Type a number:");
        verify(mock).write(argThat(message -> message.contains("III")));

    }
}
