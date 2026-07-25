class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];
        for(int i=1;i<strs.length;i++){
            String currPref = "";
            for(int k=0;k<Math.min(strs[i].length(),prefix.length());k++){
                if(prefix.charAt(k) == strs[i].charAt(k)){
                    currPref += prefix.charAt(k);
                }
                else {
                    break;
                }
            }
                prefix = currPref;
        }
        return prefix;
    }
}