class Solution {
    public boolean detectCapitalUse(String s) {
        int n = s.length();
        int c = 0;
        for( char ch : s.toCharArray()){
            if(ch >= 'A' && ch <= 'Z') c++;
        }
        if(c == n || c == 0) return true;
        else{
            if(c == 1 && s.charAt(0) >= 'A' && s.charAt(0) <= 'Z') return true;
            else return false;
        }
    }
}