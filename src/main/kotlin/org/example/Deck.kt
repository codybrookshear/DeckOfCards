package org.example

class Deck {

    private val cards = mutableListOf<Card>()

    init {
        // Add all 52 cards in a standard deck
        for (suit in Suit.entries) {
            for (faceValue in FaceValue.entries) {
                cards.add(Card(suit, faceValue))
            }
        }
    }

    fun shuffle() {
        // perform a perfect "out" shuffle:
        // * the deck gets split in 2 even halves ( "top half" and "bottom half"
        // * if there's an odd number of cards, the "top half" will have 1 extra card.
        // * "out" means the original top card remains on top after the shuffle
        // * the resulting post-shuffle ordering will be:
        //   * 1st (top) card from top half, 1st (top) card from bottom half,
        //   * 2nd card from top half, 2nd card from bottom half, and so on.
        // TODO unit test

        var halfSize = cards.size / 2
        if (cards.size % 2 == 1) {
            // if odd, top half gets the extra card
            halfSize++
        }

        val topHalf = cards.subList(0, halfSize)
        val bottomHalf = cards.subList(halfSize, cards.size)
        val shuffled = mutableListOf<Card>()
        for (i in topHalf.indices) {
            shuffled.add(topHalf[i])
            if (i < bottomHalf.size) { // take care of odd # of cards situation
                shuffled.add(bottomHalf[i])
            }
        }

        // replace the Cards list with the shuffled list
        cards.clear()
        cards.addAll(shuffled)

    }

    fun deal_card() : Card? {
        if (cards.isEmpty()) {
            return null
        }
        return cards.removeAt(0)
    }
}