class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False
        
        hashm={}
        
        for char in s:
            hashm[char]=hashm.get(char,0)+1 #store characters in hashmap
        

        for char in t:
            if char not in hashm:
               return False
            
            hashm[char]-=1

            if hashm[char]<0:
                return False

        return True
    
            

            
        