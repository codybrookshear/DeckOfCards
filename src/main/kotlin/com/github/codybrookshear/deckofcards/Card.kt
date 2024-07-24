package com.github.codybrookshear.deckofcards

data class Card(val suit : Suit, val faceValue: FaceValue) {

    override fun toString(): String {
        return "$faceValue$suit"
    }
}