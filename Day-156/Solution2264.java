class Solution {
    public String largestGoodInteger(String s) {
        int n=s.length();
        int max=-1;
        boolean is=true;
        char ch=s.charAt(0);
        for(int i=1;i<3;i++){
            if(ch!=s.charAt(i)){
                is=false;
                break;
            }
        }

        if(is==true){
            max=Math.max(max,Integer.parseInt(s.substring(0,3)));
        }

        for(int i=1;i<n-2;i++){
            if(s.charAt(i)==s.charAt(i+1) && s.charAt(i+1)==s.charAt(i+2)){
                max=Math.max(max,Integer.parseInt(s.substring(i,i+3)));
            }
        }

        if(max==0){
            return "000";
        }
        if(max!=-1){
            return new String(String.valueOf(max));
        }
        return "";
    }
}
