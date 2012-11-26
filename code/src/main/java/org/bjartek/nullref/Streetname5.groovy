package org.bjartek.nullref

class Streetname5 { 
  def streetName(person) { 
    return person?.address?.street
  }
}
