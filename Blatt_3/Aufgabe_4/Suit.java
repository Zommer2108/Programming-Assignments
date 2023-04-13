package SpielKarten;

//Definition of the enumeration for suits (Clubs, Spades, Hearts, Diamonds)
enum Suit {
 CLUBS, // German name: Kreuz
 SPADES, // German name: Pik
 HEARTS, // German name: Herz
 DIAMONDS; // German name: Karo

 // Class method to convert an integer to a Suit enumeration value
 public static Suit fromInt(int suitNr) {
     switch (suitNr) {
         case 0:
             return CLUBS;
         case 1:
             return SPADES;
         case 2:
             return HEARTS;
         case 3:
             return DIAMONDS;
         default:
             return null;
     }
 }
}

