import com.github.codybrookshear.deckofcards.Card;
import com.github.codybrookshear.deckofcards.Deck;

public class Main {
    public static void main(String[] args) {

        Deck d = new Deck();
        Card card = d.deal_card();
        System.out.println(card);

        d.shuffle();
        card = d.deal_card();
        System.out.println(card);
    }
}