import java.util.*;

public class SetMapMethod {
    public static void main(String[] args){
        Set<Integer> hashSet = new HashSet<>();
        Map<String,Integer> map = new HashMap<>();

        hashSet.add(2); hashSet.add(5); hashSet.add(1); hashSet.add(4); hashSet.add(3); 
        System.out.println("hashSet : " + hashSet); 
        System.out.println("hashSet.contains(3) : " + hashSet.contains(3));

        map.put("First", 1); map.put("Second", 2); map.put("Third", 3); map.put("Fourth", 4); map.put("Fifth", 5);
        System.out.println("map : " + map);
        System.out.println("map.get(\"Fourth\") : " + map.get("Fourth"));
        System.out.println("map.conatins(\"Fourth\") : " + map.containsKey("Fourth"));
        System.out.println("map.keySet() : " + map.keySet()); // Key 배열
        System.out.println("map.entrySet() : " + map.entrySet()); // Key = Value Set
        System.out.println("map.values() : " + map.values());

        System.out.println("");
        System.out.println("[map.entrySet > map.getKey() , map.getValue()]");
        for(Map.Entry<String, Integer> entry : map.entrySet()){
            System.out.println("Key : " + entry.getKey() + ", Value : " + entry.getValue());
        }
    }
}
