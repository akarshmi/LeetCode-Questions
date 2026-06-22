class Solution {
     public static boolean isHappy(int n) {
        return isHappy(n, new HashSet<>());
    }

    private static boolean isHappy(int n, Set<Integer> seen) {
        if (n == 1) {
            return true;
        }

        if (seen.contains(n)) {
            return false;
        }

        seen.add(n);

        int currSum = 0;

        while (n > 0) {
            int digit = n % 10;
            currSum += digit * digit;
            n /= 10;
        }

        return isHappy(currSum, seen);
    }
}