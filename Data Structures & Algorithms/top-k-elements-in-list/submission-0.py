class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        countDict = {}

        for i in nums:
            if i in countDict.keys():
                countDict[i] += 1
            else:
                countDict[i] = 1
        
        countSorted = list(countDict.values())
        countSorted.sort(reverse=True)

        countSliced = countSorted[:k]

        topK = []
        for key, value in countDict.items():
            if value in countSliced:
                topK.append(key)

        return topK

