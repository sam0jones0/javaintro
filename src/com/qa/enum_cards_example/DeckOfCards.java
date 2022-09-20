package com.qa.enum_cards_example;

import java.util.ArrayList;

public class DeckOfCards {
    ArrayList<Card> deck;

    DeckOfCards() {
        this.deck = new ArrayList<>();

        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                deck.add(new Card(suit, rank));
            }
        }

        deck.sort(null);
    }
}
