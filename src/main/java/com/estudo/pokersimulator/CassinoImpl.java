package com.estudo.pokersimulator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class CassinoImpl {

    public void menu() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("===== Cassino 0.0.1 =====");
        System.out.println("Vamos Jogar Poker!");
        System.out.print("Digite 1 para pegar suas cartas : ");
        int escolha = scanner.nextInt();
        System.out.println("============");

        if (escolha == 1) {
            playGame();
        }
    }

    private void playGame() {

        var deck = deck();

        var firstCard = deck.get(0);
        var secondCard = deck.get(1);

        String mao =  firstCard + " " +  secondCard;

        deck.remove(firstCard);
        deck.remove(secondCard);

        System.out.println("Sua mão é: " + mao);

        var flop1 = deck.get(0);
        var flop2 = deck.get(1);
        var flop3 = deck.get(2);

        System.out.println("============");
        System.out.println("FLOP: " + flop1 + ", " + flop2 + " " + flop3);
        System.out.println("Pote: " + 0);
        deck.remove(flop1);
        deck.remove(flop2);
        deck.remove(flop3);

        var turn = deck.get(0);
        System.out.println("============");
        System.out.println("TURN: " + turn);
        System.out.println("Pote: " + 0);

        deck.remove(turn);

        var river = deck.get(0);
        System.out.println("============");
        System.out.println("RIVER: " + river);
        System.out.println("Pote: " + 0);
        deck.remove(river);

    }


    List<String> cardsDeckGenerator() {

        String names[] = {"Às", "Dois", "Três", "Quatro", "Cinco", "Seis", "Sete", "Oito", "Nove", "Valete", "Dama", "Rei"};
        String suits[] = {"Copas", "Espadas", "Paus", "Ouros"};

        List<String> cardsDeck = new ArrayList<>();

        for (int j = 0; j < suits.length; ++j) {

            for (int i = 0; i < names.length; ++i) {

                Card cards = new Card(names[i],suits[j]);

                cardsDeck.add(names[i] + " " + suits[j]);

//                System.out.println(cards.getName() + " " + cards.getSuit());

            }
        }

        return cardsDeck;
    }

    List<String> deck() {

        return cardsDeckGenerator();
    }
}
