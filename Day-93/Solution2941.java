class Solution {
    public long dividePlayers(int[] skill) {
        Arrays.sort(skill);
        int n=skill.length;
        int tar=skill[n-1]+skill[0];
        if(n==2){
            return skill[0]*skill[1];
        }

        long chem=0;
        for(int i=0;i<n/2;i++){
            if((skill[i]+skill[n-i-1])!=tar){
                return -1;
            }
            chem+=(long)(skill[i] * skill[n-i-1]);
        }

        return chem;
    }
}
