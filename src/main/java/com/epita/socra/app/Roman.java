package com.epita.socra.app;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class Roman {

    private TreeMap<Integer, String> symbols;

    public Roman(){
        symbols = new TreeMap<>(Collections.reverseOrder());
        symbols.put(1, "I");
        symbols.put(4, "IV");
        symbols.put(5, "V");
        symbols.put(9, "IX");
        symbols.put(10, "X");
        symbols.put(40, "XL");
        symbols.put(50, "L");
        symbols.put(90, "XC");
        symbols.put(100, "C");
        symbols.put(400, "CD");
        symbols.put(500, "D");
        symbols.put(900, "CM");
        symbols.put(1000, "M");
    }

    public String to_roman(Integer num) {
        StringBuilder sb = new StringBuilder();

        for (Map.Entry<Integer, String > entry : symbols.entrySet()) {

            while (num >= entry.getKey()) {
                sb.append(entry.getValue());
                num -= entry.getKey();
            }
        }
        return sb.toString();
    }

    public Integer to_arabic(String num) {
        Integer res = 0;
        for (Map.Entry<Integer, String> entry : symbols.entrySet()) {
            while (num.startsWith(entry.getValue())) {
                res += entry.getKey();
                num = num.substring(entry.getValue().length());
            }
        }
        return res;
    }
}
