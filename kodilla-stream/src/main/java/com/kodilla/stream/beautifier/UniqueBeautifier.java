package com.kodilla.stream.beautifier;

import java.util.List;
import java.util.stream.Collectors;


public class UniqueBeautifier {

    public static String separate (String text) {
        List<Character> list = text.chars().mapToObj(a -> (char)a).collect(Collectors.toList());
        return list.stream().map(a -> a + " ").map(Object::toString).collect(Collectors.joining()); }

    public static String changeBeginningEnd (String text) {
        return "# " + text + " #";
    }
}
