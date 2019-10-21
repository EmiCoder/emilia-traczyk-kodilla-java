package com.kodilla.rps;

import javax.swing.*;

public class Game {

    private int playerResult;
    private int computerResult;
    private String player;
    private int amountOfWonRoundToWin;
    private boolean end;

    public Game() {
        this.playerResult = 0;
        this.computerResult = 0;
        this.end = false;
        intro();
        play();
    }


    public void intro () {
        player = JOptionPane.showInputDialog("Podaj imie");
        amountOfWonRoundToWin = Integer.parseInt(JOptionPane.showInputDialog("Po ilu wygranych nastepuje zwyciestwo?"));
        JOptionPane.showMessageDialog(new JFrame(),
                "1 - ROCK, 2 - PAPER, 3 - SCISSORS, x - end of the game, n - restarting the game" ,
                "Basic rules", JOptionPane.INFORMATION_MESSAGE);
    }

    public void play () {
        while (!end) {
            Round round = new Round(playerResult, computerResult);
            round.play();
            playerResult = round.getPlayerResult();
            computerResult = round.getComputerResult();
            if (playerResult == amountOfWonRoundToWin || computerResult == amountOfWonRoundToWin) {
                end = true;
            }
        }

        JOptionPane.showMessageDialog(new JFrame(),
                player + " " + playerResult + ", computer: " + computerResult,
                "Game result", JOptionPane.INFORMATION_MESSAGE);

        String finalAnswer = JOptionPane.showInputDialog("Wybierz: x - koniec gry, n - rozpoczęcie nowej gry");
        if (finalAnswer.equals("x")) {
            System.out.println("Game over");
        } else {
            playerResult = 0;
            computerResult = 0;
            end = false;
            intro();
            play();
        }
    }
}

