class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        Queue<Integer> q1 = new PriorityQueue<>();
        Queue<Integer> q2 = new PriorityQueue<>();

        int moves=0;
        int n=seats.length;
        for(int i=0;i<n;i++){
            q1.offer(seats[i]);
            q2.offer(students[i]);
        }

        while(!q1.isEmpty() && !q2.isEmpty()){
            moves+=(Math.abs(q1.poll()-q2.poll()));
        }
        return moves;
    }
}
