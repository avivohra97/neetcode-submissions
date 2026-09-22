class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        setA = {}
        setB = {}
        if len(s) != len(t):
            return False
        count = 0
        for i in s:
            if i not in setA:
                setA[i] = 0
            setA[i] = setA[i]+1;

        count = 0
        for i in t:
            if i not in setB:
                setB[i] = 0
            setB[i] = setB[i]+1
            
        for k,v in setA.items():
            if k not in setB or v != setB[k]:
                return False
        return True