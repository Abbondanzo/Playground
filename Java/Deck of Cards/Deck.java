public class Deck {
    private static final int[] defaultFaceValues = {14, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
    private static final String[] defaultNames = {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
    private static final String[] defaultSuits = {"Spades", "Hearts", "Clubs", "Diamonds"};

    private Card[] deck;
    public Deck() {
        deck = new Card[defaultFaceValues.length*defaultSuits.length];
        for (int i = 0; i < defaultFaceValues.length; i++) {
            int f = defaultFaceValues[i];
            String n = defaultNames[i];
            for (int j = 0; j < defaultSuits.length; j++) {
                String s = defaultSuits[j];
                Card card = new Card(f,n,s);
                deck[i+j*defaultFaceValues.length] = card;
            }
        }
    }
    public void fisherYates() {
        int l = deck.length;
        int i;
        Card t;

        while(l>0) {
            i = (int) (Math.random() * l--);
            t = deck[l];
            deck[l] = deck[i];
            deck[i] = t;
        }
    }
    public String toString() {
        String output = "";
        for (int i = 0; i < deck.length; i++) {
            output += deck[i]+"\n";
        }
        return output;
    }
    public static void main(String[] args) {
        Deck fun = new Deck();
        fun.fisherYates();
        System.out.println(fun);
    }
}
