import java.util.Arrays;
import java.util.Collections;
public class Deck {
    public Card[] allCards = new Card[52];
    public Card[] hand = new Card[7];
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
        for(int i= 0; i <hand.length -1; i++){
            int lowest = i;

            for(int k = i+1; k <hand.length; k++){
                if (hand[k].value < hand[lowest].value){
                    lowest = k;
                }
            }
            swap(lowest, i);
        }
    }

    public void mergeSortHand() {

        ting(hand);
    }
        private static void ting(Card[] input){
        if(input.length> 1){
            Card[] first = split(input , 0, input.length/2);
            Card[] last = split(input , input.length/2, input.length);

            ting(first);
            ting(last);
            combine(input, first, last);
        }
    }
    private static Card[] split(Card[] input, int start, int finish) {
        Card[] piece = new Card[finish - start];
        for(int i = 0; i < piece.length; i++) {
            piece[i] = input[start + i];
        }
        return piece;
    }
    private static void combine(Card[] destination, Card[] a, Card[] b) {
        int i = 0;
        int j = 0;
        while(i < a.length && j < b.length) {
            if(a[i].value < b[j].value) {
                destination[i + j] = a[i];
                ++i;
            } else {
                destination[i + j] = b[j];
                ++j;
            }
        }
        for(i = 0; i < a.length; i++)
            destination[i + j] = a[i];
        for(j = 0; j < b.length; j++)
            destination[i + j] = b[j];
    }




    public static Card[] LArray(Card[] array) {
        int size = array.length / 2;
        Card[] left = new Card[size];
        for (int i = 0; i < size; i++) {
            left[i] = array[i];
        }
        return left;
    }
    public static Card[] RArray(Card[] array) {
        int size = array.length / 2;
        int sizeB = array.length - size;
        Card[] right = new Card[sizeB];
        for (int i = 0; i <= sizeB - 1; i++) {
            right[i] = array[i - 1 + sizeB];
        }
        return right;
    }

    public void binary(int Suit, int Value){
        binarySearch(hand, Suit, Value);
    }
    public void binarySearch(Card[] array, int Suit, int Value){
        if(Suit == array[array.length / 2].suit && Value == array[array.length / 2].value){
            System.out.println("Found: " + array[array.length / 2].name);
        }
        if(Suit < array[array.length / 2].suit || Value < array[array.length / 2].value){
            binarySearch(LArray(array), Suit, Value);
        }
        if(Value > array[array.length / 2].value || Suit > array[array.length / 2].suit){
            binarySearch(RArray(array), Suit, Value);
        }
        if(array.length == 1){
            System.out.println("Card not in hand");
        }
    }

}
