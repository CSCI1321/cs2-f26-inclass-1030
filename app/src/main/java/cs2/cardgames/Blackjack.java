package cs2.cardgames;

import java.util.ArrayList;
import java.util.Scanner;

public class Blackjack {
  private class Hand {
    private ArrayList<Card> cards;

    public Hand() {
      this.cards = new ArrayList<Card>();
    }

    public void addCard(Card c) {
      this.cards.add(c);
    }

    public String toString() {
      return this.cards.toString();
    }

    public String dealerToString() {
      String ret = "[--,";
      for (int i = 1; i < cards.size(); i++) {
        ret += cards.get(i).toString();
        if (i < cards.size() - 1) {
          ret += ",";
        }
      }
      return ret + "]";
    }

    public int getHandValue() {
      int total = 0;
      boolean isAce = false;
      for (int i = 0; i < this.cards.size(); i++) {
        Card c = this.cards.get(i);
        if (c.getRank() == 1)
          isAce = true;
        if (c.getRank() <= 10) {
          total += c.getRank();
        } else {
          total += 10;
        }
      }
      if (isAce && total + 10 <= 21) {
        return total + 10;
      } else {
        return total;
      }
    }
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Deck deck = Deck.standardDeck();
    deck.shuffle();

    Blackjack game = new Blackjack();
    
    Hand player = game.new Hand();
    Hand dealer = game.new Hand();
    player.addCard(deck.deal());
    dealer.addCard(deck.deal());
    player.addCard(deck.deal());
    dealer.addCard(deck.deal());
    
    System.out.println("Player has " + player + " (" + player.getHandValue() + ")");
    System.out.println("Dealer has " + dealer.dealerToString());

    System.out.println("Hit or stay? (h/s)");
    String choice = input.nextLine();
    
  }

}