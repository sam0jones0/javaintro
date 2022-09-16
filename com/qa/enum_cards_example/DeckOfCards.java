package com.qa.enum_cards_example;

import java.util.ArrayList;

public class DeckOfCards {
    ArrayList<Card> deck;

    DeckOfCards() {
        this.deck = new ArrayList<Card>();

        for (Suit suit : Suit.values()) {
            for (Rank value : Rank.values()) {
                deck.add(new Card(suit, value));
            }
        }

        // FIXME: is this correct??
        deck.sort(null);
    }
}
