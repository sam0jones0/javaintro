package com.qa.enum_cards_example;

import javax.print.attribute.standard.MediaSize;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

class CardTest {
    Card testCard;
    Card otherTestCard;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        this.testCard = new Card(Suit.SPADE, Rank.ACE);
        this.otherTestCard = new Card(Suit.HEART, Rank.TEN);
    }

//    @org.junit.jupiter.api.AfterEach
//    void tearDown() {
//    }

    @org.junit.jupiter.api.Test
    void testEquals() {
        assertEquals(testCard, testCard);
        assertNotEquals(testCard, otherTestCard);
    }

    @org.junit.jupiter.api.Test
    void testHashCode() {
        assertEquals(Objects.hash(Suit.SPADE, Rank.ACE), testCard.hashCode());
    }

    @org.junit.jupiter.api.Test
    void compareTo() {
        assertEquals(-1, testCard.compareTo(otherTestCard));
        assertEquals(0, testCard.compareTo(testCard));
        assertEquals(1, otherTestCard.compareTo(testCard));

//        Card smaller = new Card(Suit.DIAMOND, Rank.ACE);
//        Card bigger = new Card(Suit.DIAMOND, Rank.KING);
//        assertTrue(smaller < bigger);
    }

    @org.junit.jupiter.api.Test
    void testToString() {
    }

    @org.junit.jupiter.api.Test
    void getSuit() {
    }

    @org.junit.jupiter.api.Test
    void setSuit() {
    }

    @org.junit.jupiter.api.Test
    void getRank() {
    }

    @org.junit.jupiter.api.Test
    void setRank() {
    }
}
