package org.example

enum class FaceValue(val displayValue: String) {
    ACE("A"),
    TWO("2"),
    THREE("3"),
    FOUR("4"),
    FIVE("5"),
    SIX("6"),
    SEVEN("7"),
    EIGHT("8"),
    NINE("9"),
    TEN("T"),  // T instead of 10 to keep it to a single character.
    JACK("J"),
    QUEEN("Q"),
    KING("K");

    override fun toString(): String {
        return displayValue
    }
}