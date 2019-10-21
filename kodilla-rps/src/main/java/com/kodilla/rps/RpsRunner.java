package com.kodilla.rps;

import javax.swing.*;

public class RpsRunner {

    public static void main(String[] args) {

        String player = JOptionPane.showInputDialog("Podaj imie");
        int amountOfWonRoundToWin = Integer.parseInt(JOptionPane.showInputDialog("Po ilu wygranych następuje zwycięstwo?"));
        JOptionPane.showMessageDialog("");
    }
}
