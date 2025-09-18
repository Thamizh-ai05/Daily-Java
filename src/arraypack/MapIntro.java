package arraypack;

import java.util.HashMap;
import java.util.Map;

public class MapIntro {
    public static void main(String[] args) {
        Map<String, Integer> m=new HashMap<>();
        m.put("Apple",100);
        m.put("Orange",150);
        m.put("Banana",50);
        m.put("Egg",60);
        int value=m.get("Egg");
        System.out.println(value);
        for(Map.Entry<String, Integer> pair:m.entrySet()){
            System.out.println(pair.getKey()+":"+pair.getValue());
        }
    }
}
