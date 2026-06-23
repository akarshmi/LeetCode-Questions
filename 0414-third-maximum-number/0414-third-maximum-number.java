class Solution {
    public static int thirdMax(int[] nums) {
        TreeSet<Integer> set = new TreeSet<>();
        int x=0;
        for (int n : nums){
            set.add(n);
        }
        if (set.size() < 3){
            x=set.last().intValue();
            return x;
        }else{

        int element = set.descendingSet().stream()
                .skip(2)
                .findFirst()
                .orElse(-1);
        return element;
        }
    }
}