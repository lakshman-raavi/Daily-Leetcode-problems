class Solution {
    public int minMaxGame(int[] nums) {
        int n = nums.length;
        if (n == 1) {
            return nums[0];
        }
        List<Integer> res = new ArrayList<>();

        for (int num : nums) {
            res.add(num);
        }

        while (res.size() > 2) {
            List<Integer> list = new ArrayList<>();
            boolean min = true;
            boolean max = false;
            for (int i = 0; i < res.size(); i += 2) {
                if (min == true) {
                    int val = Math.min(res.get(i), res.get(i + 1));
                    list.add(val);
                    min = false;
                    max = true;
                } else {
                    int val = Math.max(res.get(i), res.get(i + 1));
                    list.add(val);
                    min = true;
                    max = false;
                }
            }
            res = list;

        }

        return Math.min(res.get(0), res.get(1));

    }

}
