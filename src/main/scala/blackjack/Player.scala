package blackjack

import scala.collection.mutable.ListBuffer

class Player(val name:String, private val strategy: Strategy = new DefaultStrategy()) {
  private val cardsInHand:ListBuffer[Card] = ListBuffer()

  // a player shouldn't have the same card twice
  def collect(cardGiven: Card): Unit = if(!cardsInHand.contains(cardGiven)) cardsInHand.append(cardGiven)

  def collect(cardsGiven: List[Card]): Unit = cardsGiven.foreach(card => if(!cardsInHand.contains(card)) cardsInHand.append(card))

  def playTurn: String = strategy.useStrategy(getTotalCardValue)

  def getTotalCardValue = cardsInHand.map(_.value).reduce(_ + _)
}
