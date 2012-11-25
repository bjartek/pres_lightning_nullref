//some crazy imports here 
public class Streetname3 { 
  public static String streetName(Optional&lt;Person&gt; p) { 
    if(p.absent()) { 
      return null;
    }
    Person person = p.get();
    if(person.getAddress().absent()) { 
      return null;
    }

    return person.getAddress().get().getStreetName();
  }
}

