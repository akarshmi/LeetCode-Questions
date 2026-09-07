class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for(int k : nums){
            set.add(k);
        }
        List<Integer> ans = new ArrayList<>();
        for(int i = 1; i<=nums.length; i++){
            if(set.add(i)){
               ans.add(i);
            }
        }  
        return ans;
    }
}