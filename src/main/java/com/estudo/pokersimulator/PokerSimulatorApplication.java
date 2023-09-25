package com.estudo.pokersimulator;

public class PokerSimulatorApplication {

    public static void main(String[] args) {

        PokerSimulatorImpl pokerSimulatorService = new PokerSimulatorImpl();

        pokerSimulatorService.menuInicial();

        pokerSimulatorService.cardsDeckGenerator();

    }

}