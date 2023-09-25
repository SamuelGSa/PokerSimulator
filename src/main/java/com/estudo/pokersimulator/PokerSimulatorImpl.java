package com.estudo.pokersimulator;

import java.util.HashMap;
import java.util.Map;


public class PokerSimulatorImpl {

    Map<String,String> cardsDeckGenerate() {

        String names[] = {"Às", "Dois", "Três", "Quatro", "Cinco", "Seis", "Sete", "Oito", "Nove", "Valete", "Dama", "Rei"};
        String suits[] = {"Copas", "Espadas", "Paus", "Ouros"};

        HashMap<String,String> cardsDeck = new HashMap<>();

        for (int j = 0; j < suits.length; ++j) {

            for (int i = 0; i < names.length; ++i) {

                Card cards = new Card(names[i],suits[j]);

                cardsDeck.put(names[i],suits[j]);
                System.out.println(cards.getName() + " " + cards.getSuit());
            }
        }

        return cardsDeck;
    }


}
