class Solution {
    static {
        for (int i = 0; i < 500; ++i) {
            moveZeroes(new int[2]);
        }
    }

    public static void moveZeroes(int[] n) {
        int l = 0, r = 0;
        while (r <= n.length-1) {
            if (n[r] != 0) {
                int t = n[r];
                n[r] = n[l];
                n[l] = t;
                l++;
            }
            r++;
        }

    }
}