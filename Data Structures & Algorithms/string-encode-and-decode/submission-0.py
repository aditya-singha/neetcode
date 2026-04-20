class Solution:

    def encode(self, strs: List[str]) -> str:
    
        res = ""
        for s in strs:
        
            res += s + "é"
        return res
    def decode(self, s: str) -> List[str]:
        if not s:
            return []
    
        res = s.split("é")
    
        return res[:-1]
