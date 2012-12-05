package org.bjartek.nullref;

import org.bjartek.nullref.model.Address;
import org.bjartek.nullref.model.Person;

public class Main {
    public static void main(String[] args) {


        StreetnameProvider service = new PlainJava();
//       StreetnameProvider service = new PlainJavaNullsafe();
//       StreetnameProvider service = new Groovy();

        Person noStreetname = new Person(new Address(null));
        Person person = new Person(new Address("Lofthusveien"));
        Person noAdr = new Person(null);

        System.out.println(service.streetName(person));
        System.out.println(service.streetName(null));
        System.out.println(service.streetName(noAdr));
        System.out.println(service.streetName(noStreetname));


    }

}
