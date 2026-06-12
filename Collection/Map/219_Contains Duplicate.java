class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        boolean result = false;
        /*
        for(int i=0;i<nums.length-1;i++){
            if(result)break;
            for(int j=i+1;j<nums.length;j++){
                if(nums[i] == nums[j]){
                    int n = i-j;
                    if(n < 0) n = n * (-1);
                    if(n<=k){
                        result = true;
                        break;
                    }
                }

            }
        }
        */
        Map<Integer,List<Integer>> freqMap = new HashMap<Integer,List<Integer>>();
        for(int i=0;i<nums.length;i++){
            if(!freqMap.containsKey(nums[i])){
                freqMap.put(nums[i],new ArrayList<Integer>());
            }
            freqMap.get(nums[i]).add(i);
        }
        for(int n : nums){
            List<Integer> lst = new ArrayList<Integer>(freqMap.get(n));
            for(int i=0;i<lst.size()-1;i++){
                if(result)break;
                for(int j=i+1;j<lst.size();j++){
                    int x = lst.get(i) - lst.get(j);
                    if(x<0) x = x * (-1);
                    if(x<=k){
                        result = true;
                        break;
                    }
                }
            }
        }
        return result;
    }
}
