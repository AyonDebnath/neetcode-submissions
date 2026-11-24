class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> count = new HashMap<>();

        for (int num : nums)
        {
            count.put(num, count.getOrDefault(num, 0)+1);
        }

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> (count.get(b) - count.get(a)));
        
        Set<Integer> uniqueNums = new HashSet<>();
        for (int num: nums)
        {
            uniqueNums.add(num);
        }

        for(int num: uniqueNums)
        {
            maxHeap.add(num);
        }

        int[] topK = new int[k];
    
        for (int i = 0; i < k; i ++)
        {
            topK[i] = maxHeap.poll();
        }

        return topK;
    }

}
