class Solution:
    def encode(self, strs) :
        string = ""

        if len(strs) == 0:
            return string
            
        for value in strs:
            string += str(len(value)) + value

        print(string)
        return string

    def decode(self, s: str) :
        if len(s) == 0:
            return []
        lst = []
        i = int(s[0])
        start = 1
        while i < len(s):
            end = start + i
            value = s[start:end]
            lst.append(value)

            if end >= len(s):
                break

            i = int(s[end])
            start = end + 1
        return lst
