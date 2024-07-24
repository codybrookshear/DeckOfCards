package org.example;

fun main() {
    val d = Deck()  // a new deck, left un-shuffled, will be in a deterministic order

    for (i in 1..52) {
        print("${d.deal_card()} ")
    }
    print("\n")

    val d2 = Deck()
    d2.shuffle()  // kind of just have to trust that it happened.

    var card : Card?
    while (d2.deal_card().also { card = it } != null) {  // just another way to loop through
        print("$card ")
    }
    print("\n")
}