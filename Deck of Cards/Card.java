public class Card {
    private int faceValue;
    private String name;
    private String suit;

    public Card(int f, String n, String s) {
        faceValue = f;
        name = n;
        suit = s;
    }
    public String toString() {
        return name + " of " + suit;
    }
    public int getFaceValue() {
        return faceValue;
    }
    public String getName() {
        return name;
    }
    public String getSuit() {
        return suit;
    }
}
//
// getters for each
// tostring method
//
// deck class
// array of cards
// use some fucking loops and constants
// tostring prints every card in deck by newline
// getdeck returns deck
