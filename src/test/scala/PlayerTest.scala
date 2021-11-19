import blackjack.{Card, Player}
import org.scalatest.FunSuite
import stubs.DefaultStrategyStub

class PlayerTest extends FunSuite {

  test("testPlayTurn") {
    val prish = new Player("Priscilla Odame", new DefaultStrategyStub())
    prish.collect(new Card("Queen", 10, "Spade"))
    prish.collect(new Card("Queen", 10, "Heart"))
    assert(prish.playTurn == "Stick")
  }

  test("testGetTotalCardValueIsCorrect") {
    val frank = new Player("Frank Choongsaeng")
    frank.collect(new Card("Jack", 10, "Spade"))
    frank.collect(new Card("Jack", 10, "Spade"))
    assert(frank.getTotalCardValue == 10, "Sum of cards given to frank should be 10")
  }
}
