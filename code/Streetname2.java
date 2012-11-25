
public class Streetname2 { 
  public static String streetName(Person person) { 
    if(person == null || person.getAddress() == null) {
      return null;
    }
    return person.getAddress().getStreetName();
  }
}
