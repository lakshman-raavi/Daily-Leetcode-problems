class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count=0;
        
        int n=items.size();

        for(List<String> str : items){
                if(ruleKey.equals("type")){
                    if(ruleValue.equals(str.get(0))){
                        count++;

                    }
                }
                else if(ruleKey.equals("color")){
                    if(ruleValue.equals(str.get(1))){
                        count++;
                    }
                }
                else{
                    if(ruleValue.equals(str.get(2))){
                        count++; 
                    }
                } 
        }

        return count;
    }
}
