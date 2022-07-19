package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.ArrayList;
//an ace is an 11 or a 1
public class Hand {//hand data
    ArrayList<Card> cards = new ArrayList<>();
    int handValue;


    public void handValue() {
        handValue = 0;
        int cardVal;
        boolean aceCase = false;

        for (Card card : cards) {
            if (card.getCardValue() == 11 || card.getCardValue() == 12 || card.getCardValue() == 13) {
                cardVal = 10;
            } else {
                cardVal = card.getCardValue();
            }
            if (card.getCardValue() == 1) {
                aceCase = true;
            }
            handValue += cardVal;
        }
        if (aceCase && handValue + 10 <= 21) {
            handValue += 10;
        }
        setHandValue(handValue);
    }

    public boolean underOver(){
        return getHandValue() > 21;

    }

    public void clearHand(){
        cards.clear();
    }
    public Hand() {
    }

    public Hand(ArrayList<Card> cards, int handValue) {
        this.cards = cards;
        this.handValue = handValue;
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public void setCards(ArrayList<Card> cards) {
        this.cards = cards;
    }

    public int getHandValue() {
        return handValue;
    }

    public void setHandValue(int handValue) {
        this.handValue = handValue;
    }

    @Override
    public String toString() {
        return "Hand{" +
                "cards=" + cards +
                ", handValue=" + handValue +
                '}';
    }


}

