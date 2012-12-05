package org.bjartek.nullref;

import com.google.common.base.Optional;
import org.bjartek.nullref.gmodel.Person;

public interface StreetnameProviderOptional {

    public static String DEFAULT = "Not found";

    /*
     * Return the streetName of the address of a person or DEFAULT if not found
     */
    public String streetName(Optional<Person> person);
}
