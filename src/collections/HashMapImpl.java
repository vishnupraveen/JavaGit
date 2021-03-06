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
        while(itr.hasNext())
        {
            String state=itr.next();
            System.out.println("Capital of "+state+" is "+map.get(state));
        }

        System.out.println(map);
    }
}
