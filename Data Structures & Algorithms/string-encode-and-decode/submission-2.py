import copy

class Solution:

    def encode(self, strs: List[str]) -> str:
        string = ""
        if len(strs) == 0:
            return string
            
        for value in strs:
            string += str(len(value)) +'#'+ value

        print(string)
        return string
        
    def decode(self, s: str) -> List[str]:
        if s == "":
            return []
        lst = []
        count = ""
        counter = 0
        countReady = False
        word = ""
        for i in s:
            if not(countReady):
                if i != '#':
                    count += i
                else:
                    countReady = True
            else:
                if counter < int(count):
                    word += i
                    counter += 1
                elif counter == int(count):
                    lst.append(word)
                    count = copy.deepcopy(i)
                    counter = 0
                    countReady = False
                    word = ""
        lst.append(word)
        return lst
                