package labs_examples.objects_classes_methods.labs.oop.C_blackjack;



import labs_examples.objects_classes_methods.labs.objects.Ex3.Computer;

import javax.lang.model.type.DeclaredType;
import java.util.ArrayList;
import java.util.Scanner;

public class BlackJackController {
    public static void main(String[] args) {
        playBlackJack();


    }

    public static void playBlackJack() {
        Deck deck = new Deck();
        deck.populate();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Name");
        String name = scan.nextLine();
        Hand hand1 = new Hand();
        Hand dealer = new Hand();
        Player player = new Player(name, hand1, 10);
        Player computer = new Player("Computer", dealer, 0);
        deck.deal(player);
        deck.deal(player);
        hand1.handValue();
        deck.deal(computer);
        deck.deal(computer);
        dealer.handValue();
        System.out.println(player);
        System.out.println("Do you want another card? true/false");
        boolean yesNo = scan.nextBoolean();

        if (yesNo) {
            do {
                deck.deal(player);
                hand1.handValue();
                System.out.println(player);
                if (hand1.underOver()) {
                    System.out.println("Do you want another card? True/false");
                }
                if (computer.computerAi()) {
                    deck.deal(computer);
                    dealer.handValue();
                    System.out.println("Computer took another card");
                }

                yesNo = scan.nextBoolean();
            } while (yesNo && !hand1.underOver());


        } else if (computer.computerAi()) {
            do {
                deck.deal(computer);
                dealer.handValue();
                System.out.println("computer took another card");
            } while (computer.computerAi() && !dealer.underOver());

        }
        System.out.println(player);
        System.out.println(computer);

        if(player.hand.handValue > computer.hand.handValue && player.hand.handValue <= 21){
            System.out.println("You win!!!");
        } else if (hand1.underOver() && dealer.underOver())  {
            System.out.println("You both busted");
        }else {
            System.out.println("Computer wins");
        }

    }
}
