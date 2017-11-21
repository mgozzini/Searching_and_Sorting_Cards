import java.util.Arrays;
import java.util.Collections;

public class Deck {
    private Card[] allCards = new Card[52];
    private Card[] hand = new Card[52];

    public Deck(boolean check){
            if(check){
                int count = 0;
            for(int i=0;i<=4; i++){
                for(int k=0; k<=13; k++){
                    if(k<=10 && k > 1){
                        String name = Integer.toString(k);
                        allCards[count]= new Card(i, k, name);
                        count++;
                    }
                    else if(k==1){
                        allCards[count]= new Card(i, k, "Ace");
                        count++;
                    }
                    else if(k==11){
                        allCards[count]= new Card(i, k, "Jack");
                        count++;
                    }
                    else if(k==12){
                        allCards[count]= new Card(i, k, "Queen");
                        count++;
                    }
                    else if(k==13){
                        allCards[count]= new Card(i, k, "King");
                        count++;
                    }
                }
            }
        }
    }

    public void swap(int first, int second){
        Card temp = allCards[first];
        allCards[first] = allCards[second];
        allCards[second] = temp;
    }

    public void dealHand(int numCards){
        for(int i = 0; i<numCards; i++){
            hand[i] = allCards[13];
        }
        System.out.println(hand);
    }

    public void shuffleDeck(){
        Collections.shuffle(Arrays.asList(allCards));
    }

    public void listHand(){
        for(int i = 0; i < hand.length; i++){
            System.out.println(hand[i].name + " ");
        }
    }

    public void bubbleSortHand(){
        for(int i = 0; i< allCards.length - 2; i++){
            if(allCards[i].value > allCards[i+1].value){
                swap(i, i+1);
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









