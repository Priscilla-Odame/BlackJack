package blackjack

trait Strategy {
  def useStrategy(cardValue: Int): String
}

class DefaultStrategy extends Strategy{
  override def useStrategy(cardValue: Int): String = cardValue match {
    case i if(i < 17) => "Hit"
    case i if(i >= 17 && i <= 21) => "Stick"
    case i if(i > 21) => "Go Bust"
  }
}
