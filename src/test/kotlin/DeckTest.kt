import org.example.Card
import org.example.Deck
import org.example.FaceValue
import org.example.Suit
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
    fun testEveryCardExactlyOnce() {

    }



    @Test
    fun testEmptyDeckShuffle() {

    }

}