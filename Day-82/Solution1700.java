class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int res = 0;
        int n = students.length;
        Queue<Integer> qu1 = new ArrayDeque<>();
        Queue<Integer> qu2 = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            qu1.offer(students[i]);
            qu2.offer(sandwiches[i]);
        }

        while (!qu1.isEmpty()) {
            if (qu1.peek() == qu2.peek()) {
                res++;
                qu1.poll();
                qu2.poll();
            } else {
                int count = 0;
                int currsize = qu1.size();

                while (qu1.peek() != qu2.peek()) {
                    int val = qu1.peek();
                    qu1.poll();
                    qu1.offer(val);
                    count++;
                    if (count >= currsize) {
                        return n - res;
                    }
                }

                qu1.poll();
                qu2.poll();
                res++;
                count=0;
            }
        }
        return n - res;
    }
}
