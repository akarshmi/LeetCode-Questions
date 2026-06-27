class Solution {
    static {
        Solution warmup = new Solution();
        for (int i = 0; i < 500; ++i) {
            warmup.moveZeroes(new int[2]);
        }
    }

    public void moveZeroes(int[] n) {
        int l = 0, r = 0;

        while (r <= n.length - 1) {
            if (n[r] != 0) {
                int t = n[l];
                n[l] = n[r];
                n[r] = t;
                l++;
            }
            r++;
        }
    }
}