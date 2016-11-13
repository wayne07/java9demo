package de.seliger;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionFactoryExample {

    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 3);
        Set<Integer> integers2 = Set.of(1, 2, 3, 4);
        Map<String, String> map = Map.of("hallo", "welt");
        System.out.printf("ende");
    }

}
