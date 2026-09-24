class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        answer = []
        n = len(nums)
        left = [0]*n
        right = [0]*n

        curr = 1
        for i in range(n):
            left[i] = curr
            curr = curr*nums[i]

        curr = 1
        for i in range(n-1, -1, -1):
            right[i] = curr
            curr = curr*nums[i]

        for i in range(n):
            answer.append(left[i] * right[i])
        
        return answer
