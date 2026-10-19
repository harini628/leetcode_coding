class Solution {
    public int pivotIndex(int[] nums) {
        int result = -1;
        int rigthsum = 0;
        for(int n=0;n<nums.length;n++){
            rigthsum += nums[n];
        }
        int leftsum = 0;
        for(int i=0;i<nums.length;i++){
            rigthsum -= nums[i];
            if(i!=0)leftsum += nums[i-1];
            if(leftsum == rigthsum){
                result = i;
                break;
            }
        }
        return result;
    }
}
