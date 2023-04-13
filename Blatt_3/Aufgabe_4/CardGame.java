package SpielKarten;

public class CardGame {
    public static void main(String[] args) {
        // Generate and print 10 random cards
        for (int i = 0; i < 10; i++) {
            Card randomCard = Card.random();
            System.out.println(randomCard.name());
        }
    }
}
