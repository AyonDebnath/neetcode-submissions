class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        anagrams_dict = {}

        for i in range(0, len(strs)):
            word = list(strs[i])
            word.sort()
            word = "".join(word)
            
            if word in anagrams_dict:
                anagrams_dict[word].append(i)
            else:
                anagrams_dict[word] = [i]
                
        groupAnagrams = []
        for key, value in anagrams_dict.items():
            words = []
            for index in value:
                words.append(strs[index])
            groupAnagrams.append(words)
        return groupAnagrams