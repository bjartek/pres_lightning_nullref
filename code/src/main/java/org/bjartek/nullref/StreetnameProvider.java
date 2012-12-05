package org.bjartek.nullref;

import org.bjartek.nullref.model.Person;

public interface StreetnameProvider {

    public static String DEFAULT = "Not found";

    /*
     * Return the streetName of the address of a person or DEFAULT if not found
     */
    public String streetName(Person person);
}
