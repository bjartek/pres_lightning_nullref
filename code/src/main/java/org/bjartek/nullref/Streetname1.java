package org.bjartek.nullref;

public class Streetname1 { 
  public String streetName(Person person) { 
    return person.getAddress().getStreetName();
  }
 }
