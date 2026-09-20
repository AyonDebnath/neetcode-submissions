class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        anagrams_dict = {}

        for i in range(0, len(strs)):
            word = list(strs[i])
            word.sort()
            word = "".join(word)
            
            if word in anagrams_dict:
                anagrams_dict[word].append(strs[i])
            else:
                anagrams_dict[word] = [strs[i]]
                
        groupAnagrams = []
        for key, value in anagrams_dict.items():
            groupAnagrams.append(value)
        return groupAnagrams