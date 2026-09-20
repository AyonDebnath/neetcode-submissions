class Solution:

    def encode(self, strs: List[str]) -> str:
        strs = list(strs)
        return " ".join(strs)

    def decode(self, s: str) -> List[str]:
        return s.split(" ")