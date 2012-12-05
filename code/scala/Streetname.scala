
case class Address(streetName: String)
case class Person(address: Option[Address])

def streetName(person:Option[Person]): String = 
  person.flatMap(p => p.address.map(_.streetName)) .getOrElse("Not Found")
