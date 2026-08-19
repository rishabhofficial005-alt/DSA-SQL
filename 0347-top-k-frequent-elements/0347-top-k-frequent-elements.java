import java.util.*;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        // 1. Count frequency
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // 2. Create buckets
        List<Integer>[] bucket = new ArrayList[nums.length + 1];

        // 3. Put each number into bucket according to its frequency
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

            int num = entry.getKey();
            int freq = entry.getValue();

            if (bucket[freq] == null) {
                bucket[freq] = new ArrayList<>();
            }

            bucket[freq].add(num);
        }

        // 4. Take elements from highest frequency
        int[] ans = new int[k];
        int index = 0;

        for (int freq = bucket.length - 1; freq >= 0; freq--) {

            if (bucket[freq] != null) {

                for (int num : bucket[freq]) {

                    ans[index++] = num;

                    if (index == k) {
                        return ans;
                    }
                }
            }
        }

        return ans;
    }
}