package org.bjartek.nullref;
import com.google.common.base.Optional;

public class Streetname3 { 
  public static String streetName(Optional<GPerson> p) { 
    if(!p.isPresent()) { 
      return null;
    }
    GPerson person = p.get();
    if(!person.getAddress().isPresent()) { 
      return null;
    }

    return person.getAddress().get().getStreetName();
  }
}

