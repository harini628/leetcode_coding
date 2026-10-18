class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double avg = 0;
        double sum = 0;
        for(int i=0;i<k;i++){
            sum += nums[i];
        }
        avg = sum/k;
        
        for(int j = k;j<nums.length;j++){
            sum = sum - nums[j-k] + nums[j];
            if(sum/k > avg) avg = sum/k;
        }
        return avg;
        
    }
}
