class Solution {
    public int[] twoSum(int[] num, int target)
    {
        Map<Integer, Integer> seen = new HashMap<>();
        for (int i = 0; i < num.length; i++)
        {
            if (seen.containsKey(target - num[i])){
                int[] keys = new int[]{i, seen.get(target - num[i])};
                Arrays.sort(keys);
                return keys;
            }
            seen.put(num[i], i);
        }
        return new int[2];
    }
}