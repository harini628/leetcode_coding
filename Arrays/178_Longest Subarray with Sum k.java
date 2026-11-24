/*
178. Longest subarray with sum K
Given an array nums of size n and an integer k, find the length of the longest sub-array that sums to k. If no such sub-array exists, return 0.

Example 1:
Input: nums = [10, 5, 2, 7, 1, 9],  k=15
Output: 4
Explanation:The longest sub-array with a sum equal to 15 is [5, 2, 7, 1], which has a length of 4. This sub-array starts at index 1 and ends at index 4, and the sum of its elements (5 + 2 + 7 + 1) equals 15. Therefore, the length of this sub-array is 4.

Example 2:
Input: nums = [-3, 2, 1], k=6
Output: 0
Explanation:There is no sub-array in the array that sums to 6. Therefore, the output is 0.
*/

class Solution {
    public int longestSubarray(int[] nums, int k) {
      //optimized code : only for positive and 0 elements in array and won't work for negative elements 
      /*
        int maxlength = 0;int r=0;int l=0;
        int sum =0;
        while(l<nums.length && r < nums.length ){
            sum = sum + nums[r];
            while(sum > k && l <= r){
                sum = sum - nums[l];
                l++;
            }
             if(sum == k){
                maxlength = Math.max(maxlength,r-l+1);
            }
            r++;
        }
        return maxlength;
      */
      
       Map<Integer , Integer> sumIndexMap = new HashMap<>();int longest = 0;int sum = 0;
       for(int i=0;i<nums.length;i++){
            sum = sum + nums[i];
            if(sum == k)longest = (i+1 > longest)?i+1:longest;
            if(sumIndexMap.containsKey(sum-k)){
                long length = i - sumIndexMap.get(sum-k);
                longest = (length > longest)?length:longest;
            }
            if(!sumIndexMap.containsKey(sum-k))sumIndexMap.put(sum,i);
            
       }
       return longest;
    }
}
