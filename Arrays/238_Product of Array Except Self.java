class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        int product = 1;
        int countZero = 0;
        boolean isZero = false;
        
        for(int i : nums){
            if(i != 0){
                product *= i;
            }else{
                isZero = true;
                countZero++;
            }
        }
        for(int j=0;j<nums.length;j++){
            if(nums[j] == 0){
                if(countZero>1){
                    result[j] = 0;
                }else{
                    result[j] = product;
                }
                
            }else if(isZero){
                result[j] = 0;
            }else{
                result[j] = product/nums[j];
            }
        }
        return result;
    }
}
