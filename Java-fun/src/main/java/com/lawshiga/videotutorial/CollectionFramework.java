package com.lawshiga.videotutorial;

import java.util.*;

public class CollectionFramework {
    public static void main(String[] args) {
        Collection<Integer> value = new ArrayList<>();//collection is the interface
        value.add(4);
        value.add(7);
        value.add(9);
        value.add(12);
        value.add(15);
        value.add(1);
//        Collections.sort(value);

        System.out.println(value);
        List<Integer> list = new ArrayList<>();//list is the interface
        list.add(34);
        list.add(4);
        list.add(3);
        list.add(1, 78);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

        Set<Integer> set = new HashSet<>();//set is the interface
        set.add(34);
        set.add(3);
        set.add(3);
        set.add(6);
        set.add(7);
        System.out.println(set);// no duplicates

        Set<Integer> s = new TreeSet<>();
        s.add(45);
        s.add(76);
        s.add(75);
        s.add(25);
        s.add(56);
        System.out.println(s);// in sorted order

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Monday");
        map.put(2, "Tuesday");
        map.put(3, "Wednesday");
        map.put(null, "Thursday");
        map.put(null, "Friday");
        System.out.println(map);

        Map<String, String> map1 = new Hashtable<>();
        map1.put("Prince", "Harry");
        map1.put("President", "Obama");
        map1.put("Cricketer", "Williamson");
//        map1.put(null, "so"); not allowed
        System.out.println(map1);

        // since collection doesn't have index, use Iterator to fetch value from Collection
        Iterator iterator = value.iterator();
        while (iterator.hasNext()) {
            Object obj = iterator.next();
            System.out.println("element :" + obj);
        }
    }
}
