class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum = 0;
        int j=0;
        int size = nums.length+1;
        for(int i=0;i<nums.length;i++){
            sum = sum + nums[i];
            while(sum>=target && j<nums.length){
                if(size>i-j+1)size = i-j+1;
                sum = sum - nums[j];
                j++;
                
            }
        }
        return (size==nums.length+1)?0:size;
    }
}
