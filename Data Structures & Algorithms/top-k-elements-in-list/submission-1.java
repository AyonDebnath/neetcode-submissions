
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();
		for (int i = 0 ; i < nums.length; i++)
		{
			freq.put(nums[i], freq.getOrDefault(nums[i], 0) + 1);
		}
		
		PriorityQueue<Integer> minHeap = new PriorityQueue<>((a, b) -> freq.get(a) - freq.get(b));
		
		for (int num: freq.keySet())
		{
			minHeap.offer(num);
			if (minHeap.size() > k)
			{
				minHeap.poll();
			}
		}

		int[] topK = new int[k];
		for (int i = 0 ; i < k; i ++)
		{
			topK[i] = minHeap.poll();
		}
        return topK;
    }
}

