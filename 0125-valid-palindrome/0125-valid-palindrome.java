class Solution {
    public static boolean isPalindrome(String s) {
        String k = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        
        for(int i=0;i<k.length();i++){
            
            if(k.charAt(i)==k.charAt(k.length()-1-i)){
                continue;
            }else{
                return false;
            }
        }
        return true;
    }
}