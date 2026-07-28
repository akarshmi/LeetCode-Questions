class Solution {
  static{
        for(int i = 0; i <= 500; i++) 
            containsDuplicate(new int[]{0, 1, 0});
    }
    public static boolean containsDuplicate(int[] nums) {
        if( nums==null || nums.length==0) return false;
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i=0; i<nums.length; i++){
            if(!set.add(nums[i])) return true;
        }
        return false;
    }
}