
case class Address(streetName: String)
case class Person(address: Option[Address])

def streetName(person:Option[Person]): String = {
  val name = for { 
    p <- person
    a <- p.address
  } yield a.streetName

  name.getOrElse("Not Found")
}

