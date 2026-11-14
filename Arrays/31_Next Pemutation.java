class Solution {
    public void nextPermutation(int[] nums) {
        int index = -1;
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i] < nums[i+1]){
                index = i;
                break;
            }
        }
        if(index == -1){
            int n=0;int m = nums.length-1;
            while(n<m){
                int temp = nums[n];
                nums[n] = nums[m];
                nums[m] = temp;
                n++;m--;
            }
        }
        else{
            for(int i = nums.length-1;i>index;i--){
                if(nums[index] < nums[i]){
                    int temp = nums[i];
                    nums[i] = nums[index];
                    nums[index] = temp;
                    break;
                }
            }
            int n = index+1;int m = nums.length-1;
            while(n<m){
                int temp = nums[n];
                nums[n] = nums[m];
                nums[m] = temp;
                n++;m--;
            }
        }
    }
}
