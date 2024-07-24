package org.example

data class Card( val suit : Suit, val faceValue: FaceValue) {

    override fun toString(): String {
        return "$faceValue$suit"
    }
}