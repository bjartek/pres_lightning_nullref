package org.bjartek.nullref;

import com.google.common.base.Optional;
import org.bjartek.nullref.gmodel.*;

public class GuavaIterator implements StreetnameProviderOptional {

    @Override
    public String streetName(Optional<Person> p) {
        for (Person person : p.asSet()) {
            for (Address adr : person.getAddress().asSet()) {
                return adr.getStreetName().or(StreetnameProvider.DEFAULT);
            }
        }
        return StreetnameProviderOptional.DEFAULT;
    }
}

