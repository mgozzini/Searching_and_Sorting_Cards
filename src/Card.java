public class Card {
    int suit;
    int value;
    String name = "";
    public Card(int suit, int value){
        this.suit = suit;
        this.value = value;
        if(value == 1 ){
            this.name += "Ace";
        }
        else if(value>1 && value<11){
            this.name += value;
        }
        else if(value==11){
            this.name += "Jack";
        }
        else if(value==12){
            this.name += "Queen";
        }
        else if(value==13){
            this.name += "King";
        }
        switch(suit){
            case 1:
                this.name += " of Hearts";
                break;
            case 2:
                this.name += " of Spades";
                break;
            case 3:
                this.name += " of Clubs";
                break;
            case 4:
                this.name += " of Diamonds";
                break;
        }
    }
}
