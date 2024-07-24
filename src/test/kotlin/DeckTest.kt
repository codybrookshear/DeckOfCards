import org.example.Deck
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertNotNull
import org.junit.jupiter.api.Assertions.assertNull

class DeckTest {
    private lateinit var deck : Deck

    @org.junit.jupiter.api.BeforeEach
    fun setup() {
        deck = Deck()
    }

    @Test
    fun testVerifyCardCount() {
        // should have 52 valid deals before the deck is empty
        // and returns null
        for (i in 1..52) {
            assertNotNull(deck.deal_card())
        }
        assertNull(deck.deal_card())
        assertNull(deck.deal_card())

    }

    @Test
    fun testMutability() {
        println(deck)
    }
}