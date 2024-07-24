package org.example;

fun main() {

    var d = Deck()

    println(d.deal_card())
    println(d.deal_card())
    d.shuffle()
    println(d.deal_card())
    println(d.deal_card())
}