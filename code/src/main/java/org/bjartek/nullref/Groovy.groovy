package org.bjartek.nullref

import com.google.common.base.Objects
import org.bjartek.nullref.model.Person

class Groovy implements StreetnameProvider {

    @Override
    String streetName(Person person) {
        String name = person?.address?.streetName
        return Objects.firstNonNull(name, StreetnameProvider.DEFAULT)
    }
}
