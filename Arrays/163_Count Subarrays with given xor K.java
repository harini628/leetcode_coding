/*
163. Count subarrays with given xor K
Given an array of integers nums and an integer k, return the total number of subarrays whose XOR equals to k.

Example 1:
Input : nums = [4, 2, 2, 6, 4], k = 6
Output : 4
Explanation : The subarrays having XOR of their elements as 6 are [4, 2],  [4, 2, 2, 6, 4], [2, 2, 6], and [6]

Example 2:
Input :nums = [5, 6, 7, 8, 9], k = 5
Output : 2
Explanation : The subarrays having XOR of their elements as 5 are [5] and [5, 6, 7, 8, 9]
*/

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
