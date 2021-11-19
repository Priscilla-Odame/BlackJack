import blackjack.{Card, Deck}
import org.scalatest.FunSuite;

class DeckTest extends FunSuite {

  test("popCard") {
    val cardDeck = new Deck();
    val expectedCard = Card("Ace", 11, "Diamond")
    assert(cardDeck.popCard == expectedCard, "Should return an expected card")
    assert(cardDeck.popCard != expectedCard, "Should not return the same card on second call")
  }
}
