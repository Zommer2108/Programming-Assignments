package SpielKarten;

//Definition of the enumeration for ranks (2 to 10, Jack, Queen, King, Ace)
enum Rank {
TWO, // German name: 2
THREE, // German name: 3
FOUR, // German name: 4
FIVE, // German name: 5
SIX, // German name: 6
SEVEN, // German name: 7
EIGHT, // German name: 8
NINE, // German name: 9
TEN, // German name: 10
JACK, // German name: Bube
QUEEN, // German name: Dame
KING, // German name: König
ACE; // German name: Ass

// Class method to convert an integer to a Rank enumeration value
public static Rank fromInt(int rankNr) {
   switch (rankNr) {
       case 0:
           return TWO;
       case 1:
           return THREE;
       case 2:
           return FOUR;
       case 3:
           return FIVE;
       case 4:
           return SIX;
       case 5:
           return SEVEN;
       case 6:
           return EIGHT;
       case 7:
           return NINE;
       case 8:
           return TEN;
       case 9:
           return JACK;
       case 10:
           return QUEEN;
       case 11:
           return KING;
       case 12:
           return ACE;
       default:
           return null;
   }
}
}
