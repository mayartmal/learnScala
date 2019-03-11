object Types extends App{
  val message: String = "This is string value"
  val message2: AnyRef = message

  //val wrongMsg: AnyRef = "Must be error"
  //val wrongMsg2: String = wrongMsg

  val unitValue: Unit = 13




  println(message2)
  println(unitValue)

}
