package org.bjartek.nullref;

import com.google.common.base.Optional;
class GPerson { 

  private final Optional<Address> address;

  public GPerson(Optional<Address> address) { 
    this.address = address;
  }

  public Optional<Address> getAddress() { 
    return address;
  }
 }
