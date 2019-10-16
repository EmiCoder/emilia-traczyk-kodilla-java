package com.kodilla.stream.beautifier;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UniqueBeautifier {

    public static String separate (String text) {
        List<Character> list = text.chars().mapToObj(a -> (char)a).collect(Collectors.toList());
        String result = "";
        for (Character character : list) {
            result += String.valueOf(character) + " ";
        }
        return result;
    }

    public static String changeBeginningEnd (String text) {
        return "# " + text + " #";
    }
}
