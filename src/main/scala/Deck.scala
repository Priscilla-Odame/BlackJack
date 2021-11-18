import scala.collection.mutable.ListBuffer

class Deck {
  private val deck:List[Card] = SpadeSuite.cards.concat(HeartSuite.cards).concat(ClubSuite.cards).concat(DiamondSuite.cards)

  def getCard = deck.last

  def shuffle = ???
}
