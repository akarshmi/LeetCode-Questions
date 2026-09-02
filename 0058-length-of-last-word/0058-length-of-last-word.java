class Solution {
    public int lengthOfLastWord(String s) {
        String str = s.strip();

        int i = str.length() - 1;
        int c = 0;

        while (i >= 0 && str.charAt(i) != ' ') {
            c++;
            i--;
        }

        return c;
    }
}