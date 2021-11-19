package stubs

import blackjack.Strategy

class DefaultStrategyStub extends Strategy{
  override def useStrategy(cardValue:Int): String = "Stick"
}