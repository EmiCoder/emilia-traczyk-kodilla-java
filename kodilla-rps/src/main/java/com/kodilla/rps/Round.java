package com.kodilla.rps;

import java.util.Random;

public class Round {

    private int playerResult;
    private int computerResult;
    private String player;

    public Round(String player, int playerResult, int computerResult) {
        this.playerResult = playerResult;
        this.computerResult = computerResult;
        this.player = player;
    }

    public void play () {

        Random generator = new Random();
        int playerMove = Integer.parseInt(View.input("Wykonaj ruch: 1,2,3"));
        int computerMove = generator.nextInt(2) + 1;
        View.output((player +": " + playerMove + ", ComputerMove: " + computerMove), "Moves");
        if ((playerMove == 1 && computerMove == 3) || (playerMove == 2 && computerMove == 1) || (playerMove == 3 && computerMove == 2)) {
            setPlayerResult(this.playerResult + 1);
        } else if ((playerMove == 1 && computerMove == 2) || (playerMove == 2 && computerMove == 3) || (playerMove == 3 && computerMove == 1)) {
            setComputerResult(this.computerResult + 1);
        }
    }

    public int getPlayerResult() {
        return playerResult;
    }

    public int getComputerResult() {
        return computerResult;
    }

    public void setPlayerResult(int playerResult) {
        this.playerResult = playerResult;
    }

    public void setComputerResult(int computerResult) {
        this.computerResult = computerResult;
    }
}
