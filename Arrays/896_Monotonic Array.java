class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean flaginc = true;
        boolean flagdesc = true;

        for(int i=0;i<nums.length-1;i++){

            if(flaginc){
                if (!(nums[i] <= nums[i+1])) flaginc=false;
            }

            if(flagdesc){
                if (!(nums[i] >= nums[i+1]))flagdesc = false;
            }
            
        }
        return (flaginc || flagdesc);
    }
}
