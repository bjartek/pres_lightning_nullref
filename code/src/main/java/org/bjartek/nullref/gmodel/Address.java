package org.bjartek.nullref.gmodel;

import com.google.common.base.Optional;

public class Address {

    private final Optional<String> streetname;

    public Address(Optional<String> streetname) {
        this.streetname = streetname;
    }

    public Optional<String> getStreetName() {
        return streetname;
    }
}
