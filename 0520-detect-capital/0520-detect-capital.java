class Solution {
    public static boolean detectCapitalUse(String word) {
        int uc = 0;
        int lc = 0;
        char[] ch = word.toCharArray();
        for (char c : ch) {
            if (c >= 65 && c <= 90) {
                uc++;
            } else if (c >= 97 && c <= 122) {
                lc++;
            }
        }

        System.err.print(lc + "       " + uc);
        if (lc == 0 && uc == word.length()) {
            System.err.print(lc + "       " + uc);
            return true;
        }
        if (uc == 0 && lc == word.length()) {
            return true;
        }
        if (uc == 1 && word.charAt(0) >= 'A' && word.charAt(0) <= 'Z') {
            return true;
        } else {
            return false;
        }
    }
}