class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        Map<Integer,Integer> countMap = new HashMap<Integer,Integer>();
        for(int i : nums){
            if(!countMap.containsKey(i)){
                countMap.put(i,1);
            }else{
                countMap.put(i,countMap.get(i)+1);
            }
            
        }
        for(int j : nums){
            if(countMap.get(j) == 1){
                result = j;
                break;
            }
        }
        return result;
        
    }
}
