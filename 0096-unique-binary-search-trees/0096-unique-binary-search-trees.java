class Solution {
    public int numTrees(int n) {
        long c = 1;
        for (int i = 0; i < n; i++) {
            c = c * (2 * n - i);
            c = c / (i + 1);
        }
        return (int)(c / (n + 1));
    }
}