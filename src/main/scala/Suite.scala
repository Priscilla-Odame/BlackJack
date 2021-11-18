import scala.collection.mutable.ListBuffer

abstract class Suite(protected val suiteName: String) {

  protected val _cards: ListBuffer[Card] = ListBuffer(
    new Card("2", 2, suiteName),
    new Card("3", 3,suiteName),
    new Card("4", 4, suiteName),
    new Card("5", 5, suiteName),
    new Card("6", 6, suiteName),
    new Card("7", 7, suiteName),
    new Card("8", 8, suiteName),
    new Card("9", 9, suiteName),
    new Card("10", 10, suiteName),
    new Card("Jack", 10, suiteName),
    new Card("Queen", 10, suiteName),
    new Card("King", 10, suiteName),
    new Card("Ace",11, suiteName)
  )
  def cards = _cards.toList

}

object SpadeSuite extends Suite("Spade")

object HeartSuite extends Suite("Heart")

object DiamondSuite extends Suite("Diamond")

object ClubSuite extends Suite("Club")
