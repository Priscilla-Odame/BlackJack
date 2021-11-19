package blackjack

import scala.collection.mutable.ListBuffer

class Player(val name:String, private val strategy: Strategy = new DefaultStrategy()) {
  private val cards:ListBuffer[Card] = ListBuffer()

  // a player shouldn't have the same card twice
  def collect(card: Card): Unit = if(!cards.contains(card)) cards.append(card)

  def playTurn: String = strategy.useStrategy(getTotalCardValue)

  def getTotalCardValue = cards.map(_.value).reduce(_ + _)
}
