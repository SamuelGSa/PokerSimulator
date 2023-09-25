package com.estudo.pokersimulator;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Player {

    String name;

    Boolean isBot;

    Integer coins;
}
