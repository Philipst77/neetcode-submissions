class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False

        s_map={}
        t_map={}

        for ct, cs in zip(s,t):
            s_map[ct] = s_map.get(ct,0) +1
            t_map[cs] = t_map.get(cs,0) +1

        if s_map == t_map:
            return True
        return False
