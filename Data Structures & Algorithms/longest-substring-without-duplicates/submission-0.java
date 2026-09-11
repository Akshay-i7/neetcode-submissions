class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> mp=new HashMap();
        int l=0,r=0,maxLen=0;
        while(r<s.length()){
            if(mp.containsKey(s.charAt(r))){
                while(s.charAt(l) != s.charAt(r)) {
                    mp.remove(s.charAt(l));
                    l++;
                }
                l++;

            }
            mp.put(s.charAt(r),0);
            maxLen=Math.max(maxLen,r-l+1);
            r++;
        }
        return maxLen;
    }

}

