class Solution {
    public int subarraysWithXorK(int[] nums, int k) {
      int prefixXor = 0;int count = 0;
      Map<Integer,Integer> prefixXorCountMap = new HashMap<>();
      prefixXorCountMap.put(0,1);
      for(int i=0;i<nums.length;i++){
        prefixXor = prefixXor ^ nums[i];
        if(prefixXorCountMap.containsKey(prefixXor ^ k)){
            count += prefixXorCountMap.get(prefixXor ^ k);
        }
        if(prefixXorCountMap.containsKey(prefixXor)){
            prefixXorCountMap.put(prefixXor,prefixXorCountMap.get(prefixXor)+1 );
        }else{
            prefixXorCountMap.put(prefixXor,1);
        }
      }
      return count;
    }
}
