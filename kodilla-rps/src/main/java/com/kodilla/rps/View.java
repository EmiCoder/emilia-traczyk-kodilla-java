package com.kodilla.rps;

import javax.swing.*;

public class View {

    public static String input (String question) {
        return JOptionPane.showInputDialog(question);
    }

    public static void output (String message, String titile) {
        JOptionPane.showMessageDialog(new JFrame(), message, titile, JOptionPane.INFORMATION_MESSAGE);
    }
}
