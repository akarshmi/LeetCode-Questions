class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] answer = new int[n];

        int[] st = new int[n];
        int top = -1;

        for (int i = 0; i < n; i++) {
            while (top >= 0 && temperatures[i] > temperatures[st[top]]) {
                int prevIdx = st[top--];
                answer[prevIdx] = i - prevIdx;
            }
            st[++top] = i;
        }

        return answer;
    }
}