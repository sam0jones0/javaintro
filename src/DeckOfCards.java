public class DeckOfCards {

    private Card[] deck;

    public class Card {
        private char suit;
        private String value;

        public Card(char suit, String value) {
            this.suit = suit;
            this.value = value;
        }

        public Card() {
        }

        public String toString() {
            return value + suit;
        }

        public String toString() {
            return value + suit;
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
        String[] values = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A" };

        int pos = 0;
        for (char suit : suits) {
            for (String value : values) {
                deck[pos] = new Card(suit, value);
                pos++;
            }
        }
    }

    public static void main(String[] args) {
        DeckOfCards myDeck = new DeckOfCards();
        for (Card aCard : myDeck.deck) {
            System.out.println(aCard);
        }
    }
}
