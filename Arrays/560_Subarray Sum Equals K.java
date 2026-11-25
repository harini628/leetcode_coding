class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        int prefixSum = 0;
        Map<Integer,Integer> prefixSumCountMap = new HashMap<>();
        prefixSumCountMap.put(0,1);
        for(int i=0;i<nums.length;i++){
            prefixSum += nums[i];
            if(prefixSumCountMap.containsKey(prefixSum - k)){
                count += prefixSumCountMap.get(prefixSum - k);
            }
            if(prefixSumCountMap.containsKey(prefixSum)){
                prefixSumCountMap.put(prefixSum,prefixSumCountMap.get(prefixSum)+1);
            }else{
                prefixSumCountMap.put(prefixSum,1);
            }
        }
        return count;
    }
}
