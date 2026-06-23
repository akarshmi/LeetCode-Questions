class Solution {
    public int majorityElement(int[] nums) {
        int c= 0, cnt = 0;

        for(int n:nums){
            if(cnt==0){
                c=n;
            }
            cnt+=(n==c) ? 1 : -1;
        }
        return c;
    }
}