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
        if (otherCard == this || this.equals(otherCard)) {
            return 0;
        }

        // This might work and looks nicer?
        // var x = this.suit.compareTo(otherCard.suit);

        // @Eylem if you see this: It's sorting wrong and I can't figure out why.
        // FIXME: Something not quite working right...

        if (this.suit.ordinal() < otherCard.suit.ordinal()) {
            return -1;
        } else if (this.rank.ordinal() > otherCard.rank.ordinal()) {
            return 1;
        } else {
            if (this.rank.ordinal() < otherCard.rank.ordinal()) {
                return -1;
            } else if (this.rank.ordinal() > otherCard.rank.ordinal()) {
                return 1;
            } else {
                return 0;
            }
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
