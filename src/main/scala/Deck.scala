import scala.collection.mutable.ListBuffer
import scala.util.Random.shuffle

class Deck {
  private var deck:ListBuffer[Card] = ListBuffer().concat(SpadeSuite.cards).concat(HeartSuite.cards).concat(ClubSuite.cards).concat(DiamondSuite.cards)

  /**
   * removes and returns the last card on top of the stack
   * @return Card
   */
  def popCard = deck.remove(deck.size - 1)

  def shuffleDeck:Unit = deck = shuffle(deck)
}
