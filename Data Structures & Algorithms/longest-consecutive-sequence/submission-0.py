class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        max_count = {} # nums[i] -> max sequence count for nums[i] where nums[i] is the start of a sequence

        map = {}
        for i in range(len(nums)):
            map[nums[i]] = 0
        
        for i in range(len(nums)):
            if nums[i] - 1 not in map.keys():
                max_count[nums[i]] = 1
        
        for start in max_count.keys():
            num = start+1
            while num in map.keys():
                max_count[start] += 1
                num += 1
        
        maximum = 0
        for value in max_count.values():
            if value>maximum:
                maximum = value
        
        return maximum