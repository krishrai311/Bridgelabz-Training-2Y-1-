package DemoHashMap;

import java.util.HashMap;

public class Basic {
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();
        map.put("Rahul",21);
        map.put("Mayank",22);
        map.put("Krish",23);
        System.out.println(map);
        System.out.println();
        System.out.println(map.get("Krish"));
        System.out.println(map.get("Mayank"));
        System.out.println();
        System.out.println(map.containsKey("Krish"));
        System.out.println(map.containsValue("Om"));
        System.out.println();
        System.out.println(map.containsValue(1));
        System.out.println(map.containsValue(22));
        System.out.println();
        System.out.println(map.remove("Krish"));
        System.out.println(map);
        System.out.println();
        System.out.println(map.values());
        System.out.println();
        System.out.println(map.keySet());
        System.out.println();
        System.out.println(map.size());
        System.out.println();
        map.clear();
        System.out.println(map.isEmpty());



    }
}
