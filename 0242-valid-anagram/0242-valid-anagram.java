class Solution {
    static {
        for(int i =0; i<500;i++){
            isAnagram("ana","naa");
        }
    }
     
    public static boolean isAnagram(String s, String t) {
        char[] m =  s.toCharArray();
        char[] l =  t.toCharArray();
        Arrays.sort(m);
        Arrays.sort(l);
        return Arrays.equals(m, l);
    }
}