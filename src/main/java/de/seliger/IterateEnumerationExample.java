package de.seliger;

import java.util.Enumeration;
import java.util.stream.Stream;

public class IterateEnumerationExample {

    public static void main(String[] args) {
        Enumeration<Object> properties = System.getProperties().elements();
        if (properties.hasMoreElements()) {
            Stream.iterate(properties.nextElement(), p -> properties.hasMoreElements(), p -> properties.nextElement())
                    .forEach(System.out::println);
        }
    }

}
