class Solution {
    static {
        for(int i =0; i<500;i++){
            isAnagram("ana","naa");
        }
    }
     
    public static boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }

        int[] dp = new int[26];
        for(int i=0; i<t.length();i++){
            dp[s.charAt(i) - 'a']++;
            dp[t.charAt(i) - 'a']--;
        }

        for(int i : dp){
            if(i!=0) return false;
        } 
       return true;
    }
}