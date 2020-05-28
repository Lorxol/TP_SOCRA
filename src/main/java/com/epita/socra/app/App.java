package com.epita.socra.app;

import com.epita.socra.app.tools.*;

import java.util.Collections;
import java.util.TreeMap;

/**
 * Hello world!
 */
public final class App {
    private IOAdapter adapter;

    private App() {
        this(new ConsoleAdapter());
    }

    public App(IOAdapter adapter) {
        this.adapter = adapter;
    }

    /**
     * Says hello to the world.
     *
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        App application = new App();
        application.run();
    }

    public void run() {
        adapter.write("Type a number:");
        String number = adapter.read();
        Roman roman = new Roman();
        String res = new String();
        try {
            res = roman.to_roman(Integer.parseInt(number));
        }
        catch (NumberFormatException e)
        {
            adapter.write("Incorrect input format");
        }
        adapter.write(res.toString());
    }

}
