class Solution {
    public int maxProduct(int[] nums) {
        /*
        Time Complexity: O(N²)
        Space Complexity: O(1)
        
        int max_product = Integer.MIN_VALUE;
        int product = 1;
        for(int i=0;i<nums.length;i++){
            product = 1;
            for(int j=i;j<nums.length;j++){
                product *= nums[j];
                if(product > max_product)max_product = product;
            }
        }
        return max_product;
        */
        
        /*OPTIMIZED SOLUTION:
        Time Complexity: O(N)
        Space Complexity: O(1)
         */
        
        int max_product = Integer.MIN_VALUE;
        int prefix = 1;int suffix = 1;

        for(int i=0;i<nums.length;i++){
            
            prefix *= nums[i];
            suffix *= nums[nums.length-1-i];
            
            int max =(prefix >= suffix)?prefix:suffix;
            max_product = ( max_product >= max )?max_product:max;

            if(prefix == 0)prefix = 1;
            if(suffix == 0)suffix = 1;
        }

        return max_product;
    }
}
