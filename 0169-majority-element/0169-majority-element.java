class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> m = new HashMap<>();
        for(int num : nums){
            m.put(num,m.getOrDefault(num,0)+1);

            if(m.get(num)>nums.length/2){
                return num;
            }
        }
        return -1;
    }
}