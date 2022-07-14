package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import labs_examples.inheritance.examples.Whale;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Deck {//deck data
    Card [] cards = new Card[52];

    ArrayList<Integer> usedCards = new ArrayList<>();


    public void populate() {
        char[] suit = {'♠', '♦', '♥', '♣'};
        int count = 0;
        while (count < cards.length) {
            for (int i = 0; i < suit.length; i++) {
                for (int val = 1; val <= 13; val++) {
                    cards[count++] = new Card(suit[i], val);

                }

            }

        }

    }

 public void deal(Player player){
     Random rand = new Random();
     int upper = 52;
     int randomNum = rand.nextInt(upper);

     while(usedCards.contains(randomNum)){
         randomNum = rand.nextInt(upper);
     }
     player.hand.cards.add(cards[randomNum]);
     usedCards.add(randomNum);









 }

    public Deck() {
    }

    public Deck(Card[] cards, ArrayList<Integer> usedCards) {
        this.cards = cards;
        this.usedCards = usedCards;
    }

    public Card[] getCards() {
        return cards;
    }

    public void setCards(Card[] cards) {
        this.cards = cards;
    }

    public ArrayList<Integer> getUsedCards() {
        return usedCards;
    }

    public void setUsedCards(ArrayList<Integer> usedCards) {
        this.usedCards = usedCards;
    }

    @Override
    public String toString() {
        return "Deck{" +
                "cards=" + Arrays.toString(cards) +
                ", usedCards=" + usedCards +
                '}';
    }


}
