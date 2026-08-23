class Solution {

    public int[] topKFrequent(int[] nums, int k) {

        java.util.HashMap<Integer, Integer> freq =
                new java.util.HashMap<>();

        // Count frequency of every number
        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        // Create buckets
        java.util.List<Integer>[] buckets =
                new java.util.ArrayList[nums.length + 1];

        // Put each number into its frequency bucket
        for (int num : freq.keySet()) {

            int count = freq.get(num);

            if (buckets[count] == null) {
                buckets[count] = new java.util.ArrayList<>();
            }

            buckets[count].add(num);
        }

        // Get the K most frequent elements
        int[] result = new int[k];
        int index = 0;

        for (int count = buckets.length - 1;
             count >= 0 && index < k;
             count--) {

            if (buckets[count] != null) {

                for (int num : buckets[count]) {

                    result[index] = num;
                    index++;

                    if (index == k) {
                        break;
                    }
                }
            }
        }

        return result;
    }
}