class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        s = s.split()
        t = t.split()

        s.sort()
        t.sort()

        return s.equals(t)

        