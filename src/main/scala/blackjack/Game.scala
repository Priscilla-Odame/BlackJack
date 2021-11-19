package blackjack

import scala.collection.mutable.ListBuffer

class Game private (var players: ListBuffer[Player]) {
  val cardDeck = new Deck()

  def start:Unit = ???

  def hasEnded:Boolean = ???

  def announceWinner:Unit = ???
}


object Game {
  def setupGame(args: List[String]):Game = {
    // get players
    // create deck
    // shuffle deck
    // create game
    // return game
    ???
  }
}