package org.bjartek.nullref;

class Person { 

  private final Address address;

  public Person(Address address) { 
    this.address = address;
  }

  public Address getAddress() { 
    return address;
  }
 }
