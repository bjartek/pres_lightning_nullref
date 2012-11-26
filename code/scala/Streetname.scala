
case class Address(streetName: String)
case class Person(address: Option[Address])

def streetName(person:Option[Person]): Option[String] = 
  person.flatMap(p => p.address.map(_.streetName))
