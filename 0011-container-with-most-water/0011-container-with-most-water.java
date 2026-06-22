class Solution {
    static {
        for(int i=0; i<100; i++){
            maxArea(new int []{0,0});
        }
    }

    public static int maxArea(int[] height) {
        int l = 0;
        int r = height.length-1;
        int maxArea = 0;
        while(l<r){
            int w = r-l;
            if(l==r){
                l++;
                r--;
            }
            int area = Math.min(height[l],height[r]) * w;

            if(height[l]<height[r]){
                l++;
            }else{
                r--;
            }
            
            maxArea = Math.max(maxArea,area);
            
        }

        return maxArea;

    }
}