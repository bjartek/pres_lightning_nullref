//some crazy imports here..
public class Streetname3 { 
  public static String streetName(Optional<Person> p) { 
    for(Person p: p.asSet()) { 
     for(Address a: p.getAddress().asSet())  { 
        return a.getStreetName();
     }
    }
    return null;
  }
}

