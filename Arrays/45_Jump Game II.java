class Solution {
    public int jump(int[] nums) {
        if(nums.length==1||(nums.length !=0 && nums[0] == 0))return 0;
        
        int l=0;int r=0;int jump=0;int maxReach = 0;
        while(l<nums.length && r<nums.length){
            for(int i=l;i<=r;i++){
                maxReach = Math.max(maxReach,nums[i]+i);
            }
            l=r+1;
            r=maxReach;
            jump++;
            if(r>=nums.length-1)break;
            
        }
        return jump;
        /*
        //recursion to tabulation approach ( tabulation : memory limit exceeded | recursion : time limit exceeded ).
        int[][] dp = new int[nums.length][nums.length];
        for(int j=0;j<nums.length;j++){
            dp[nums.length-1][j] = j;
        }
        
        for(int i=nums.length-2;i>=0;i--){
            for(int j=0;j<nums.length;j++){
                int n = nums[i];int min = Integer.MAX_VALUE;
                for(int a=1;a<=n && i+a < nums.length && j+1<nums.length;a++){
                    int current_step = dp[i+a][j+1];
                    min = Math.min(min,current_step);
                }
                dp[i][j] = min;
            }
        }
        return dp[0][0];
        */
    }
}
