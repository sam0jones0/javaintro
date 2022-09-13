public class DeckOfCards {

    private Card[] deck;

    public class Card {
        private char suit;
        private String value;

        public Card(char suit, String value) {
            this.suit = suit;
            this.value = value;
        }

        public char getSuit() {
            return suit;
        }

        public void setSuit(char suit) {
            this.suit = suit;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

    }

    public DeckOfCards() {
        this.deck = new Card[52];

        char[] suits = { 'C', 'H', 'S', 'D' };
        String[] values = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };

        int pos = 0;
        for (String value : values) {
            for (char suit : suits) {
                Card thisCard = deck[pos];
                thisCard.setSuit(suit);
                thisCard.setValue(value);
                pos++;
            }

        }
    }
}
