class Solution {
    public int majorityElement(int[] nums) {
        // HashMap<Integer, Integer> map = new HashMap<>();

        // for(int num : nums){
        //     map.put(num, map.getOrDefault(num,0)+1);
        // }
        // int max = 0;
        // int m = 0;
        // for(Map.Entry<Integer,Integer> e : map.entrySet()){
        //     if(e.getValue()>max){
        //         max = e.getValue();
        //         m = e.getKey();
        //     }
        // }
        //     return m;



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