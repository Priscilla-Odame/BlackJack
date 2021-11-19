package blackjack

import org.scalatest.FunSuite

class GameTest extends FunSuite {

  test("testStart") {

  }

  test("testHasEnded") {

  }

  test("testAnnounceWinner") {

  }

  test("testSetupGame") {
    assert(Game.setupGame().getClass.getSimpleName == "Game" , "should return a new Game object")
  }

}
