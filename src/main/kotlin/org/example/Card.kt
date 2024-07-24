package org.example

data class Card( val suit : Suit, val faceValue: FaceValue)

enum class Suit {
    Hearts, Spades, Clubs, Diamonds
}

enum class FaceValue {
    Ace, _2, _3, _4, _5, _6, _7, _8, _9, _10, Jack, Queen, King
}