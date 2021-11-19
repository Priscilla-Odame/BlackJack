package blackjack

abstract class Strategy {
  def useStrategy: String
}

class DefaultStrategy extends Strategy{
  override def useStrategy: String = ???
}
