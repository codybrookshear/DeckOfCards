package com.github.codybrookshear.deckofcards

import kotlin.random.Random

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

    // it just randomly rearranges the cards. it's not a "real world" shuffle like a human would do where
    // the cards get interleaved in a quasi-deterministic manner.
    // also, this is not thread safe.
    fun shuffle() {

        val copy = cards
        val shuffled = mutableListOf<Card>()

        while (copy.isNotEmpty()) {
            val r = Random.nextInt(0, copy.size)
            shuffled.add(copy[r])
            copy.removeAt(r)
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