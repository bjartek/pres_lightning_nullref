
case class Address(streetName: Option[String])
case class Person(address: Option[Address])

def streetName(person:Option[Person]): String = {
  val name = for { 
    p <- person
    a <- p.address
    sn <- a.streetName
  } yield sn

  name.getOrElse("Not Found")
}

