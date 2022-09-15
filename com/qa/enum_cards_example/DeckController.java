package com.qa.enum_cards_example;

public class DeckController {
    public static void main(String[] args) {
        DeckOfCards myDeck = new DeckOfCards();
        for (Card aCard : myDeck.deck) {
            System.out.println(aCard);
        }
    }
}
