class Solution {
    public boolean canJump(int[] nums) {
       int maxReach = 0;int i=0;
       while(i<nums.length){
            maxReach = (maxReach < i+nums[i])?i + nums[i]:maxReach;
            if(maxReach>=nums.length-1 || (nums[i] == 0 && maxReach == i))break;
            i++;
       }
       return (maxReach>=nums.length-1);
    }
}
