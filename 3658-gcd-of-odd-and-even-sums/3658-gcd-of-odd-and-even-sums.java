class Solution {
    public int gcdOfOddEvenSums(int n) {
        return n;                
        // return gcd(n*n,(n*n)+n);                
    }

    private int gcd(int f,int s){
        while(s>0){
            int t = s;
            s = f%s;
            f = t;
        }
        return f;
    }
}