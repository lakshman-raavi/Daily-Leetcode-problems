class Solution {
    public int calPoints(String[] operations) {
        Deque<Integer> stack = new ArrayDeque<>();

        int n = operations.length;
        for (String opp : operations) {
            if (opp.equals("D")) {
                int preval = stack.peek();
                preval = preval * 2;
                stack.push(preval);
            } else if (opp.equals("C")) {
                stack.pop();
            } else if (opp.equals("+")) {
                int sum = 0;
                int curr = stack.pop();
                int prev = stack.peek();
                sum = curr + prev;
                stack.push(curr);
                stack.push(sum);
            } else {
                stack.push(Integer.parseInt(opp));
            }
        }

        int totalSum = 0;
        while (!stack.isEmpty()) {
            totalSum += stack.pop();
        }
        return totalSum;
    }
}
