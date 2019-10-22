package com.kodilla.rps;

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
        player = View.input("Podaj imie");
        amountOfWonRoundToWin = Integer.parseInt(View.input("Po ilu wygranych nastepuje zwyciestwo?"));
        View.output("1 - ROCK, 2 - PAPER, 3 - SCISSORS, x - end of the game, n - restarting the game", "Basic rules");
    }

    public void play () {
        int roundCounter = 1;
        while (!end) {
            Round round = new Round(playerResult, computerResult);
            round.play();
            playerResult = round.getPlayerResult();
            computerResult = round.getComputerResult();
            View.output((player + ": " + playerResult + " Computer: " + computerResult), ("Result of " + roundCounter + " round"));
            if (playerResult == amountOfWonRoundToWin || computerResult == amountOfWonRoundToWin) {
                end = true;
            }
            roundCounter++;
        }

        View.output((player + " " + playerResult + ", computer: " + computerResult), "Game result");

        String finalAnswer = View.input("Wybierz: x - koniec gry, n - rozpoczęcie nowej gry");
        if (finalAnswer.equals("x")) {
            View.output("See You next time :)", "Game over");
        } else {
            playerResult = 0;
            computerResult = 0;
            end = false;
            intro();
            play();
        }
    }
}
