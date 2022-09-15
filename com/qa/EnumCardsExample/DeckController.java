package com.qa.EnumCardsExample;

public class DeckController {
    public static void main(String[] args) {
        DeckOfCards myDeck = new DeckOfCards();
        for (Card aCard : myDeck.deck) {
            System.out.println(aCard);
        }
    }
}
