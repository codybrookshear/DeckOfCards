package org.example;

fun main() {
    val d = Deck()

    println(d)
    println(d.deal_card())
    println(d)
    d.shuffle()
    println(d)
}