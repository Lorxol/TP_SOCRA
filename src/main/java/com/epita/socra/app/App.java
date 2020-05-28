package com.epita.socra.app;

import com.epita.socra.app.tools.*;

import java.util.Collections;
import java.util.TreeMap;

/**
 * Hello world!
 */
public final class App {
    private IOAdapter adapter;
    private boolean to_rom = true;

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
        Roman roman = new Roman();
        String res = new String();
        while (true) {

            adapter.write("> ");
            String input = adapter.read();

            if (input.isEmpty())
                break;

            if (input.contains("Roman")) {
                to_rom = true;
                continue;
            }
            if (input.contains("Arabic")) {
                to_rom = false;
                continue;
            }

            try {
                if (to_rom)
                    res = roman.to_roman(Integer.parseInt(input));
                else
                    res = roman.to_arabic(input).toString();
            } catch (NumberFormatException e) {
                adapter.write("Incorrect input format\n");
            }
            adapter.write(res + '\n');
        }

    }
}
