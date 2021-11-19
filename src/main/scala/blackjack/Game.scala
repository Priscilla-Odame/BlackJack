package blackjack

import scala.collection.mutable.ListBuffer


class Game private (var players: ListBuffer[Player], val cardDeck: Deck) {

  def start:Unit = ???

  def hasEnded:Boolean = ???

  def announceWinner:Unit = ???
}

// Facade Design Pattern
object Game {
  def setupGame(args: List[String] = null):Game = {
    // get or create players
    val players = List(new Player("Frank"), new Player("Prish"), new Player("Siobhan"))
    // create deck
    val cardDeck = new Deck();
    // create game
    val game = new Game(ListBuffer().concat(players), cardDeck)
    // return game
    game
  }
}