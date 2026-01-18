import java.util.HashMap;

public class Main67 {
    public static void main(String[] args) {

        HashMap<String, Double> map = new HashMap<>();
        map.put("Apple", 0.99);
        map.put("Banana", 0.59);
        map.put("Cherry", 2.99);

//        map.remove("Banana");
//        System.out.println(map);
//        System.out.println(map.get("Apple"));
//        System.out.println(map.containsKey("Cherry"));
//
//        if(map.containsKey("Apple")){
//            System.out.println(map.get("Apple"));
//        } else {
//            System.out.println("Apple not found");
//        }

//        System.out.println(map.containsValue(0.99));
//        System.out.println(map.size());

        for(String key : map.keySet()){
            System.out.println(key + ": $" + map.get(key));
        }
    }
}
