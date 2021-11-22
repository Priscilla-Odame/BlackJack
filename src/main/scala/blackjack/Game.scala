package blackjack

import scala.collection.mutable.ListBuffer


class Game private (var players: ListBuffer[Player], val cardDeck: Deck) {

  private var winner: Player = null
  private var roundNumber: Int = 1

  def start:Unit = {
    cardDeck.shuffleDeck
    players.foreach(_.collect(cardDeck.popCard(2)))
    while(!hasEnded) {
      players.foreach(player => {
        player.playTurn()
      })
    }
  }

  def hasEnded:Boolean = {
    // true: if all players stick in a round
    // true: if a player hits 21
    // true: if all players except one "Go Bust"
    ???
  }

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