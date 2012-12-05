package org.bjartek.nullref.gmodel;

import com.google.common.base.Optional;

public class Person {

    private final Optional<Address> address;

    public Person(Optional<Address> address) {
        this.address = address;
    }

    public Optional<Address> getAddress() {
        return address;
    }
}
