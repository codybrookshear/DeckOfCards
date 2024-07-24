package com.github.codybrookshear.deckofcards

enum class Suit(val displayValue: String) {
    HEARTS("❤"),
    SPADES("♠"),
    CLUBS("♣"),
    DIAMONDS("♦");

    override fun toString(): String {
        return displayValue
    }
}