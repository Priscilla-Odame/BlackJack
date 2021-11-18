class Player(val name:String, val strategy: Strategy) {
  val cards:List[Card] = List()

  def play = ???

  def getTotalCardValue: Int = ???
}
