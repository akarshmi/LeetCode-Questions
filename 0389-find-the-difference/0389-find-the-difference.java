class Solution {
    public static char findTheDifference(String s, String t) {
        char s1=0,s2=0;

        for (int i = 0; i < s.length(); i++) {
            s1 += s.charAt(i);
            s2 += t.charAt(i);
        }
        s2 += t.charAt(t.length()-1);

        return (char) (s2-s1);


        // char ans = 0;
        // for (int i = 0; i < s.length(); i++) {
        //     ans ^= s.charAt(i);
        //     ans ^= t.charAt(i);
        // }
        // ans ^= t.charAt(t.length() - 1);

        // return ans;

    }
}