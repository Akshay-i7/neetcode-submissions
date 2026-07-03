class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        arr=sorted(strs)
        hm={}
        newStr=[]
        if len(strs)==0:
            return list(strs)
        for word in arr:
            key=''.join(sorted(word))
            if key not in hm:
                hm[key]=[]
            hm[key].append(word)

        return list(hm.values())