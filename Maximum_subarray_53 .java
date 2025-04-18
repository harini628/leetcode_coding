class Solution {
    public int maxSubArray(int[] nums) {
        int x = 0;
        int n = nums.length;
        int size = n*(n+1) / 2;
        int res[] = new int[size];
        for (int i=0; i < nums.length ; i++){
            for(int j=i; j<nums.length ; j++){
                int sum=0;
                for(int k = i ; k <= j ; k++){
                    sum = sum + nums[k];
                }
                res[x] = sum;
                x++;
            }
        }
        int max = res[0];
        for(int i = 1; i<size ; i++){
            if(max < res[i]){
                max = res[i];
            }
        }
        return max;
    }
}
