package com.qa.enum_cards_example;

import javax.print.attribute.standard.MediaSize;

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
    }

    @org.junit.jupiter.api.Test
    void compareTo() {
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
