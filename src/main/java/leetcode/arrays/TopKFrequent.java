package leetcode.arrays;

import java.util.*;

public class TopKFrequent {

    public static void main(String[] args) {
        int[] ints = topKFrequent(new int[]{5, 1, 1, 1, 5, 5, 4}, 2);
        System.out.println(Arrays.toString(ints));
    }

    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer>[] buckets = new List[nums.length + 1];

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int i = 0; i < buckets.length; i++){
            buckets[i] = new ArrayList<>();
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
            buckets[entry.getValue()].add(entry.getKey());
        }

        int[] result = new int[k];
        int pointer = 0;
        for (int j = buckets.length - 1; j > 0 && pointer <= k; j--){
            
        }



        return null;
    }
}