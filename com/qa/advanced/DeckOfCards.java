package com.qa.advanced;

public class DeckOfCards {
    Card[] deck;

    DeckOfCards() {
        this.deck = new Card[52];

        int pos = 0;
        for (Suit suit : Suit.values()) {
            for (Rank value : Rank.values()) {
                deck[pos] = new Card(suit, value);
                pos++;
            }
        }
    }
}
