import java.util.*;
public class Maps {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        Map<String,Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
       for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
       
        // for (int i = 0; i < arr1.length; i++){
        //     System.out.print(arr1[i] + " ");
        // }


    }
}
