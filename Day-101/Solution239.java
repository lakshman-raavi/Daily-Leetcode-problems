class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n=nums.length;
        int[] res=new int[n-k+1];
        int l=0;
        // int left=0;
        // PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());


        // for(int i=0;i<k;i++){
        //     pq.offer(nums[i]);
        // }

        // list.add(pq.peek());

        // for(int i=k;i<n;i++){
        //     pq.remove(nums[left]);
        //     left++;
        //     pq.offer(nums[i]);
        //     list.add(pq.peek());
        // }
        // int[] res=list.stream().mapToInt(i->i).toArray();
        // return res;
        

        Deque<Integer> dq=new ArrayDeque<>();

        for(int i=0;i<n;i++){
            if(!dq.isEmpty() && dq.peekFirst()<=i-k){
                dq.pollFirst();
            }

            while(!dq.isEmpty() && nums[dq.peekLast()]<=nums[i]){
                dq.pollLast();
            }

            dq.offerLast(i);
            if(i>=k-1){
                res[l]=(nums[dq.peekFirst()]);
                l++;
            }
        }

        
        return res;

    }
}
