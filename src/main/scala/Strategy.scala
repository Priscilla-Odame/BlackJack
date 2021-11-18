abstract class Strategy {
  def useStrategy
}

class DefaultStrategy extends Strategy{
  override def useStrategy: Unit = ???
}