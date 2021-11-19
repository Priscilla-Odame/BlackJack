package blackjack

import org.scalatest.FunSuite

class DefaultStrategyTest extends FunSuite {
  val defaultStrategy = new DefaultStrategy();

  test("testUseStrategy") {
    assert(defaultStrategy.useStrategy(10) == "Hit", "should return a Hit")
    assert(defaultStrategy.useStrategy(17) == "Stick", "should return a Stick")
    assert(defaultStrategy.useStrategy(21) == "Stick", "should return a Stick with 21")
    assert(defaultStrategy.useStrategy(23) == "Go Bust", "should return a Go Bust with 21")
  }

}
