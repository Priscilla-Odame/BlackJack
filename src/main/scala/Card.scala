trait Card{
  val name:String
  val value:Int
}

case class Spade(override val name: String, override val value: Int) extends Card

case class Heart(override val name: String, override val value: Int) extends Card

case class Diamond(override val name: String, override val value: Int) extends Card

case class Club(override val name: String, override val value: Int) extends Card

