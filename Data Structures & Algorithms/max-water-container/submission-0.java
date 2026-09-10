class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int l=0;
        int r=n-1;
        int maxWater=0;
        while(l<r){
            int minHeight=Math.min(height[l],height[r]);
            int width=r-l;
            maxWater=Math.max(maxWater,minHeight*width);
            if(height[l]<height[r]){
                l++;
            }
            else{
                r--;
            }
        }
        return maxWater;
    }
}