# DeckOfCards
Kotlin library that simulates a deck of playing cards that can be dealt and shuffled.

## What does this library do?

A simple, runnable example is provided in [Main.kt](src/main/kotlin/org/example/Main.kt). Running this code:

```kotlin
val d = Deck()
println(d)              // start with 52 cards, always in same order
println(d.deal_card())  // remove top card (A❤)
println(d)              // top card (A❤) is gone. 2❤ is top card now.
d.shuffle()             // mix them up in a deterministic way ("out shuffle")
println(d)              // after shuffle
```

We get this output:
```text
A❤ 2❤ 3❤ 4❤ 5❤ 6❤ 7❤ 8❤ 9❤ 10❤ J❤ Q❤ K❤ A♠ 2♠ 3♠ 4♠ 5♠ 6♠ 7♠ 8♠ 9♠ 10♠ J♠ Q♠ K♠ A♣ 2♣ 3♣ 4♣ 5♣ 6♣ 7♣ 8♣ 9♣ 10♣ J♣ Q♣ K♣ A♦ 2♦ 3♦ 4♦ 5♦ 6♦ 7♦ 8♦ 9♦ 10♦ J♦ Q♦ K♦ 
A❤
2❤ 3❤ 4❤ 5❤ 6❤ 7❤ 8❤ 9❤ 10❤ J❤ Q❤ K❤ A♠ 2♠ 3♠ 4♠ 5♠ 6♠ 7♠ 8♠ 9♠ 10♠ J♠ Q♠ K♠ A♣ 2♣ 3♣ 4♣ 5♣ 6♣ 7♣ 8♣ 9♣ 10♣ J♣ Q♣ K♣ A♦ 2♦ 3♦ 4♦ 5♦ 6♦ 7♦ 8♦ 9♦ 10♦ J♦ Q♦ K♦ 
2❤ 2♣ 3❤ 3♣ 4❤ 4♣ 5❤ 5♣ 6❤ 6♣ 7❤ 7♣ 8❤ 8♣ 9❤ 9♣ 10❤ 10♣ J❤ J♣ Q❤ Q♣ K❤ K♣ A♠ A♦ 2♠ 2♦ 3♠ 3♦ 4♠ 4♦ 5♠ 5♦ 6♠ 6♦ 7♠ 7♦ 8♠ 8♦ 9♠ 9♦ 10♠ 10♦ J♠ J♦ Q♠ Q♦ K♠ K♦ A♣ 
```

### How does `shuffle()` work? 
The `shuffle()` method performs a deterministic *"out shuffle"* algorithm. It works like this. The deck gets split in 2 even halves ( **top half** and **bottom half** ). If there's an odd number of cards, the **top half** will have 1 extra card. The resulting post-shuffle ordering will be:
* 1st (top) card from top half, 1st (top) card from bottom half,
* then 2nd card from top half, 2nd card from bottom half, and so on.

Here's a simpler example. Let's say we dealt most of the cards and we have just 6 cards left in the deck:

```text
8♦ 9♦ 10♦ J♦ Q♦ K♦
```

The algorithm would split the deck in two:
```text
top half: 8♦ 9♦ 10♦
bottom half: J♦ Q♦ K♦
```
and then shuffled together as so:
```text
8♦ J♦ 9♦ Q♦ 10♦ K♦
```

## How can I build the library?

./gradlew ...

## How can I use this library in my project?

add jitpack instructions

## Anything else to know?

* There's unit tests in [src/test/kotlin](src/test/kotlin), using [Junit 5](https://junit.org/junit5/docs/current/user-guide/).
* There's [Gitlab CI](.gitlab-ci.yaml) set up to run tests on every commit