package com.kodilla.stream.beautifier;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UniqueBeautifier {

    public static String separate (String text) {

        List<String> list = new ArrayList<>();
        for (int i = 0; i < text.length(); i++) {
            list.add(String.valueOf(text.charAt(i)));
        }
        return list.stream().collect(Collectors.joining(" "));
    }

    public static String changeBeginningEnd (String text) {
        return "# " + text + " #";
    }
}
