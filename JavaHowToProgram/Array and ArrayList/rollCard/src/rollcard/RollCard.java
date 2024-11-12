
package rollcard;

import java.security.SecureRandom;

class Card { 
    private String face;
    private String suit;

    public Card(String face, String suit) {
        this.face = face;
        this.suit = suit;
    }

    @Override
    public String toString() {
        return face + " " + suit;
    }
}

public class RollCard {
    public static void main(String[] args) {
        SecureRandom roll = new SecureRandom();
        Card[] desk = new Card[52];
        String[] faces = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        String[] suits = {"tim", "ro", "tep", "bich"};

             for (int i = 0; i < desk.length; i++) {
            desk[i] = new Card(faces[i % 13], suits[i / 13]);
        }

       
        for (int first = 0; first < desk.length; first++) {
            int second = roll.nextInt(desk.length);

          
            Card temp = desk[first];
            desk[first] = desk[second];
            desk[second] = temp;
        }

        
        for (Card card : desk) {
            System.out.println(card.toString());
        }
    }
}
    

