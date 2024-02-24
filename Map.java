import java.util.HashMap;
import java.util.HashSet;

public class Map {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 1, 2, 3, 1, 2, 1};
        HashMap<Integer, Integer> frequencyHashMap = new HashMap<>();

        // Counting the frequency of each element
        for (int num : array) {
            frequencyHashMap.put(num, frequencyHashMap.getOrDefault(num, 0) + 1);
        }

        
        //creating a set to make it unique
        HashSet<Integer> set = new HashSet<>();

        for(int num : array){
            if(!set.contains(num)){
                set.add(num);
            }
        }

        // Printing the frequency of each element
        for (int num : set) {
            System.out.println("Element " + num + " occurs " + frequencyHashMap.get(num) + " times");
        }
    }

   
}
