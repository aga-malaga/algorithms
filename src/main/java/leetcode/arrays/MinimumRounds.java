package leetcode.arrays;

import java.util.HashMap;
import java.util.Map;

class MinimumRounds {

    public static void main(String[] args) {
        System.out.println(minimumRounds(new int[]{2, 2, 3, 3, 2, 4, 4, 4, 4, 4}));
    }

    public static int minimumRounds(int[] tasks) {
    int result = 0;

        Map<Integer, Integer> map = new HashMap<>();

        for (int task : tasks) {
            map.put(task, map.getOrDefault(task, 0) + 1);
        }

        for (Integer value : map.values()) {
            if (value < 2){
                return -1;
            }
            
        }
        return map.size();
    }
}
