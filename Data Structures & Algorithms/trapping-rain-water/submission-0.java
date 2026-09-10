class Solution {
    public int trap(int[] height) {
        int l=0;
        int n=height.length;
        int r=n-1;
        int water=0;
        int maxL=height[l];
        int maxR=height[r];
        while(l<r){
            if(height[l]<height[r]){
                l++;
                maxL=Math.max(maxL,height[l]);
                int curr=height[l];
                water+=(maxL-curr);
            }
            else{
                r--;
                maxR=Math.max(maxR,height[r]);
                int curr=height[r];
                water+=(maxR-curr);
            }
        }
        return water;
    }
}