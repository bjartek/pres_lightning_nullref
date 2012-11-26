package org.bjartek.nullref;
import com.google.common.base.Optional;

public class Streetname4 { 
  public static String streetName(Optional<GPerson> p) { 
    for(GPerson pers: p.asSet()) { 
     for(Address adr: pers.getAddress().asSet())  { 
        return adr.getStreetName();
     }
    }
    return null;
  }
}

