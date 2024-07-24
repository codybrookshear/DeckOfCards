# DeckOfCards
Simulate a deck of cards.

## What does this library do?

A simple, runnable example is provided in [Main.kt](src/main/kotlin/org/example/Main.kt). Running this code:
```kotlin
val d = Deck()
println(d)
println(d.deal_card())
println(d)
d.shuffle()
println(d)
```

Let me explain what the output will be. We start with a full deck of cards:

```text
A❤ 2❤ 3❤ 4❤ 5❤ 6❤ 7❤ 8❤ 9❤ 10❤ J❤ Q❤ K❤ A♠ 2♠ 3♠ 4♠ 5♠ 6♠ 7♠ 8♠ 9♠ 10♠ J♠ Q♠ K♠ A♣ 2♣ 3♣ 4♣ 5♣ 6♣ 7♣ 8♣ 9♣ 10♣ J♣ Q♣ K♣ A♦ 2♦ 3♦ 4♦ 5♦ 6♦ 7♦ 8♦ 9♦ 10♦ J♦ Q♦ K♦
```

You deal the top card (A❤) off the deck:

```text
A❤
```

We verify the dealt card (A❤) is indeed gone by calling `println(d)` again:
```text
2❤ 3❤ 4❤ 5❤ 6❤ 7❤ 8❤ 9❤ 10❤ J❤ Q❤ K❤ A♠ 2♠ 3♠ 4♠ 5♠ 6♠ 7♠ 8♠ 9♠ 10♠ J♠ Q♠ K♠ A♣ 2♣ 3♣ 4♣ 5♣ 6♣ 7♣ 8♣ 9♣ 10♣ J♣ Q♣ K♣ A♦ 2♦ 3♦ 4♦ 5♦ 6♦ 7♦ 8♦ 9♦ 10♦ J♦ Q♦ K♦
```

Now we call `shuffle()` to shuffle the cards, and then call `println(d)` again to see the result:
```text
2❤ 2♣ 3❤ 3♣ 4❤ 4♣ 5❤ 5♣ 6❤ 6♣ 7❤ 7♣ 8❤ 8♣ 9❤ 9♣ 10❤ 10♣ J❤ J♣ Q❤ Q♣ K❤ K♣ A♠ A♦ 2♠ 2♦ 3♠ 3♦ 4♠ 4♦ 5♠ 5♦ 6♠ 6♦ 7♠ 7♦ 8♠ 8♦ 9♠ 9♦ 10♠ 10♦ J♠ J♦ Q♠ Q♦ K♠ K♦ A♣
```

> [!NOTE]  
> The `shuffle()` method performs a deterministic "out" shuffle following this algorithm:
> * the deck gets split in 2 even halves ( "top half" and "bottom half"
> * if there's an odd number of cards, the "top half" will have 1 extra card.
> * "out" means the original top card remains on top after the shuffle
> * the resulting post-shuffle ordering will be:
> * 1st (top) card from top half, 1st (top) card from bottom half,
> * 2nd card from top half, 2nd card from bottom half, and so on.

## How can I use this library in my project?

add jitpack instructions 