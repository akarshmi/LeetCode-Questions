class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        HashMap<Integer,Integer> map =  new HashMap<>();
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        List<Integer> ans = new ArrayList<>();
        for(Map.Entry<Integer,Integer> e : map.entrySet()){
            if(e.getValue()>(n/3)){
                ans.add(e.getKey());
            }
        }
        return ans;
    }
}