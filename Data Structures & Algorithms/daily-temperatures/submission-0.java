class Solution {
    public int[] dailyTemperatures(int[] temp) {
        Stack<int[]> stack = new Stack<>();
        int[] answer = new int[temp.length];
        for (int i = 0; i < temp.length; i++) {
            while (!stack.isEmpty() && temp[i] > stack.peek()[0]) {
                int idx = stack.pop()[1];
                answer[idx] = i - idx;
            }
            stack.push(new int[]{temp[i],i});
        }
        return answer;
    }
}
