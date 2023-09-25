package com.estudo.pokersimulator;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class PokerSimulatorImpl {

    public void menuInicial() {

        System.out.println("--- Poker Simulator 0.0.1 ---");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Vamos te registrar. Qual é o seu nome: ");
        String nome = scanner.next();

        playerCreate(nome, false, 1000);
        playerCreate("Bot 1", true, 1000);
        playerCreate("Bot 2", true, 1000);
    }

    private Player playerCreate(String name, Boolean isBot, Integer coins) {

        Player player = new Player(name,isBot,coins);
        System.out.println("Player Criado com sucesso!");
        System.out.println("Nome: " + name + " -  Fichas iniciais: " + coins);
        return player;
    }

    Map<String,String> cardsDeckGenerator() {

        String names[] = {"Às", "Dois", "Três", "Quatro", "Cinco", "Seis", "Sete", "Oito", "Nove", "Valete", "Dama", "Rei"};
        String suits[] = {"Copas", "Espadas", "Paus", "Ouros"};

        HashMap<String,String> cardsDeck = new HashMap<>();

        for (int j = 0; j < suits.length; ++j) {

            for (int i = 0; i < names.length; ++i) {

                Card cards = new Card(names[i],suits[j]);

                cardsDeck.put(names[i],suits[j]);
//                System.out.println(cards.getName() + " " + cards.getSuit());
            }
        }

        return cardsDeck;
    }


}
