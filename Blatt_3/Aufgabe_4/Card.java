package SpielKarten;

import java.util.Random;

class Card {
    private Suit suit;
    private Rank rank;
    private static Random randomGenerator = new Random();

    // Constructor
    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    // Method to get the name of the card in English
    public String name() {
        return rank.toString() + " of " + suit.toString();
    }

    // Static method to generate a random card
    public static Card random() {
        int suitIndex = randomGenerator.nextInt(Suit.values().length);
        int rankIndex = randomGenerator.nextInt(Rank.values().length);
        Suit randomSuit = Suit.values()[suitIndex];
        Rank randomRank = Rank.values()[rankIndex];
        return new Card(randomSuit, randomRank);
    }
}


