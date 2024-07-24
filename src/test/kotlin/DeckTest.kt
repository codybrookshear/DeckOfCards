import com.github.codybrookshear.deckofcards.Card
import com.github.codybrookshear.deckofcards.Deck
import com.github.codybrookshear.deckofcards.FaceValue
import com.github.codybrookshear.deckofcards.Suit
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Order

class DeckTest {
    private lateinit var deck : Deck

    @org.junit.jupiter.api.BeforeEach
    fun setup() {
        deck = Deck()
    }

    @Test
    fun testCardCountAndNull() {
        // should have 52 valid deals before the deck is empty
        // and starts returning null
        for (i in 1..52) {
            assertNotNull(deck.deal_card())
        }
        assertNull(deck.deal_card())
    }

    @Test
    fun testDefaultOrder() {
        // by default cards should be sorted in a deterministic order
        val expectedOrder = arrayOf(
            Card(Suit.HEARTS, FaceValue.ACE),
            Card(Suit.HEARTS, FaceValue.TWO),
            Card(Suit.HEARTS, FaceValue.THREE),
            Card(Suit.HEARTS, FaceValue.FOUR),
            Card(Suit.HEARTS, FaceValue.FIVE),
            Card(Suit.HEARTS, FaceValue.SIX),
            Card(Suit.HEARTS, FaceValue.SEVEN),
            Card(Suit.HEARTS, FaceValue.EIGHT),
            Card(Suit.HEARTS, FaceValue.NINE),
            Card(Suit.HEARTS, FaceValue.TEN),
            Card(Suit.HEARTS, FaceValue.JACK),
            Card(Suit.HEARTS, FaceValue.QUEEN),
            Card(Suit.HEARTS, FaceValue.KING),
            Card(Suit.SPADES, FaceValue.ACE),
            Card(Suit.SPADES, FaceValue.TWO),
            Card(Suit.SPADES, FaceValue.THREE),
            Card(Suit.SPADES, FaceValue.FOUR),
            Card(Suit.SPADES, FaceValue.FIVE),
            Card(Suit.SPADES, FaceValue.SIX),
            Card(Suit.SPADES, FaceValue.SEVEN),
            Card(Suit.SPADES, FaceValue.EIGHT),
            Card(Suit.SPADES, FaceValue.NINE),
            Card(Suit.SPADES, FaceValue.TEN),
            Card(Suit.SPADES, FaceValue.JACK),
            Card(Suit.SPADES, FaceValue.QUEEN),
            Card(Suit.SPADES, FaceValue.KING),
            Card(Suit.CLUBS, FaceValue.ACE),
            Card(Suit.CLUBS, FaceValue.TWO),
            Card(Suit.CLUBS, FaceValue.THREE),
            Card(Suit.CLUBS, FaceValue.FOUR),
            Card(Suit.CLUBS, FaceValue.FIVE),
            Card(Suit.CLUBS, FaceValue.SIX),
            Card(Suit.CLUBS, FaceValue.SEVEN),
            Card(Suit.CLUBS, FaceValue.EIGHT),
            Card(Suit.CLUBS, FaceValue.NINE),
            Card(Suit.CLUBS, FaceValue.TEN),
            Card(Suit.CLUBS, FaceValue.JACK),
            Card(Suit.CLUBS, FaceValue.QUEEN),
            Card(Suit.CLUBS, FaceValue.KING),
            Card(Suit.DIAMONDS, FaceValue.ACE),
            Card(Suit.DIAMONDS, FaceValue.TWO),
            Card(Suit.DIAMONDS, FaceValue.THREE),
            Card(Suit.DIAMONDS, FaceValue.FOUR),
            Card(Suit.DIAMONDS, FaceValue.FIVE),
            Card(Suit.DIAMONDS, FaceValue.SIX),
            Card(Suit.DIAMONDS, FaceValue.SEVEN),
            Card(Suit.DIAMONDS, FaceValue.EIGHT),
            Card(Suit.DIAMONDS, FaceValue.NINE),
            Card(Suit.DIAMONDS, FaceValue.TEN),
            Card(Suit.DIAMONDS, FaceValue.JACK),
            Card(Suit.DIAMONDS, FaceValue.QUEEN),
            Card(Suit.DIAMONDS, FaceValue.KING),
        )

        for (i in 1..52) {
            assertEquals(deck.deal_card(), expectedOrder[i-1])
        }
    }

    @Test
    fun testEveryCardIsUnique() {
        // load up a map with each unique card;
        // we use it to remember which cards we've already seen.
        // we're card counting. shhhhhh!
        val cardMap = mutableMapOf<Card, Boolean>()
        for (suit in Suit.entries) {
            for (faceValue in FaceValue.entries) {
                cardMap.put(Card(suit, faceValue), false)  // false = we haven't seen it yet
            }
        }

        for (i in 1..52) {
            val card = deck.deal_card()   // deal a card, one at a time...
            assertFalse(cardMap[card]!!)  // verify we haven't come across it yet,
            cardMap[card!!] = true        // and then remember that we just did
        }
    }

    @Test
    fun testEmptyDeckShuffleDoesntCauseTrouble() {
        for (i in 1..52) {
            deck.deal_card()
        }
        deck.shuffle()
    }

    @Test
    fun testSingleCardShuffleDoesntCauseTrouble() {
        for (i in 1..51) {
            deck.deal_card()
        }
        deck.shuffle()
        assertNotNull(deck.deal_card())
    }

}