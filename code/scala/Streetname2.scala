
case class Address(streetName: String)
case class Person(address: Option[Address])

def streetName(person:Option[Person]): Option[String] = 
  for { 
    p <- person
    a <- p.address
  } yield a.streetName

