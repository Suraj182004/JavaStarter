import java.util.*;

public class array{
    public static void main(String[] args){
        List<Integer> arr = new ArrayList<>();
        int [] arr1 = {1, 2, 3, 4, 5};

        // for (int i = 0; i < arr1.length; i++){
        //     System.out.print(arr1[i] + " ");
        // }
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        for (int i = 0; i < arr.size(); i++){
            System.out.print(arr.get(i) + " ");
        }
    }
}