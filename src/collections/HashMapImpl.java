package collections;

import java.util.*;

public class HashMapImpl {

    public static void main(String[] args) {
        Map<String ,String> map=new HashMap<>();
        map.put("Karnataka","Bengaluru");
        map.put("Maharashtra","Mumbai");
        map.put("Tamil Nadu","Chennai");

        System.out.println(map);
        Set<String> keys=map.keySet();
        Iterator<String> itr=keys.iterator();
        System.out.println(map);
    }
}
