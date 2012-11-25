def streetName(person:Option[Person]): Option[String] = 
  person.flatMap(p => p.address.map(_.streetName))
