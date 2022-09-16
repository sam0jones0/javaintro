package com.qa.enum_cards_example;

import java.util.Objects;

public class Card implements Comparable<Card> {
    private Suit suit;
    private Rank rank;

    Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    @Override
    public boolean equals(Object otherCard) {
        if (otherCard == this) {
            return true;
        }
        if (!(otherCard instanceof Card)) {
            return false;
        }

        Card otherCardCast = (Card) otherCard;

        return this.suit == otherCardCast.suit && this.rank == otherCardCast.rank;
    }

    @Override
    public int hashCode() {
        return Objects.hash(suit, rank);
    }

    @Override
    public int compareTo(Card otherCard) {
        // Spades < Diamonds < Clubs < Hearts
        // ACE < TWO < ... < QUEEN < KING
        if (otherCard == this || this.equals(otherCard)) {
            return 0;
        }

        // This might work and looks nicer?
        // var x = this.suit.compareTo(otherCard.suit);

        if (this.suit.ordinal() < otherCard.suit.ordinal()) {
            return -1;
        } else if (this.suit.ordinal() > otherCard.suit.ordinal()) {
            return 1;
        } else {
            return Integer.compare(this.rank.ordinal(), otherCard.rank.ordinal());
        }
    }

    public String toString() {
        return rank.toString() + " of " + suit.toString();
    }

    public Suit getSuit() {
        return suit;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    public Rank getRank() {
        return rank;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }

}
