class Solution {
    public int longestConsecutive(int[] nums) {
        //optimized code:
        /*
        Time complexity : O(N) + O(2N)
        Space complexity : O(N)
        */
        if(nums.length==0)return 0;
        int longest = 1;
        Set<Integer> numsSet = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            numsSet.add(nums[i]);
        }
        for(int i : numsSet){
            int count = 1;
            if(! numsSet.contains(i-1)){
                int current = i+1;
                while(numsSet.contains(current)){
                    count++;current++;
                }
            }
            longest = (count > longest)?count : longest;
        }
        return longest;

        /*
        Data is changed by sorting 
        Time complexity : O(N) + O(N log N)
        Space complexity : O(1)
        */
        /*
        Arrays.sort(nums);
        if(nums.length == 0)return 0;
        int sequence = nums[0];int longest = 1;int count = 1;
        for(int i=1;i<nums.length;i++){
            if(nums[i] == sequence+1){
                sequence++;
                count++;
            }else if(nums[i] == sequence){
                continue;
            }else{
                sequence = nums[i];
                count = 1;
            }
            if(count>longest)longest=count;
        }
        return longest;
        */
    }
}
