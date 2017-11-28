import java.util.Arrays;
import java.util.Collections;

public class Deck {
    Card[] allCards = new Card[52];
    Card[] hand = new Card[7];
    static int count = 0;
    public Deck(boolean check) {
        count = 0;
        if (check==true) {
            for (int i = 1; i <= 4; i++) {
                for (int k = 1; k <= 13; k++) {
                    allCards[count] = new Card(i, k);
                    count++;
                }
            }
        }
    }

    public void swap(int first, int second) {
        Card temp = hand[first];
        hand[first] = hand[second];
        hand[second] = temp;
    }

    public void dealHand(int numCards) {
        for (int i = 0; i < numCards; i++) {
            hand[i] = allCards[i];
        }
        System.out.println(hand);
    }

    public void shuffleDeck() {
        Collections.shuffle(Arrays.asList(allCards));
    }

    public void listHand() {
        for (int i = 0; i < hand.length; i++) {
            System.out.println(hand[i].name + " ");
        }
    }

    public void bubbleSortHand() {
        for (int j = 0; j < hand.length - 1; j++){
            for (int i = 0; i < hand.length - 1; i++) {
                if (hand[i].value > hand[i + 1].value) {
                    swap(i, i + 1);
                }
            }
        }
    }

    public void selectionSortHand(){

    }

    public void mergeSortHand(){

    }

    public void binarySearch(int suit, int face){

    }
}









