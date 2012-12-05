
case class Address(streetName: Option[String])
case class Person(address: Option[Address])

def streetName(person:Option[Person]): String = {
  val name = person.flatMap{pers =>
    pers.address.flatMap{adr =>
      adr.streetName
    }
  }
  name.getOrElse("Not Found")
}
