package org.bjartek.nullref;

class Address { 

  private final String streetname;

  public Address(String streetname) { 
     this.streetname = streetname;
   }

  public String getStreetName() { 
     return streetname;
   }
}
