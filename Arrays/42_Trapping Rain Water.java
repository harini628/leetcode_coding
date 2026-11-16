class Solution {
    public int trap(int[] height) {
        /*
        int total = 0;
        int[] prefixMax = new int[height.length];
        int[] suffixMax = new int[height.length];
        prefixMax[0] = height[0];
        suffixMax[height.length-1] = height[height.length-1];
        for(int i=1;i<height.length;i++){
            prefixMax[i] = (prefixMax[i-1] > height[i])? prefixMax[i-1]:height[i];
            suffixMax[height.length-i-1] = (suffixMax[height.length-i] > height[height.length-i-1])? suffixMax[height.length-i]:height[height.length-i-1];
        } 
        for(int i=0;i<height.length;i++){
            total += ((prefixMax[i] > suffixMax[i])? suffixMax[i] : prefixMax[i] ) - height[i];
        }
        return total;
        */
        
        //optimized
        int total = 0;
        int left = 0;int right = height.length-1;int leftmax = 0;int rightmax = 0;
        while(left<right){
            if(height[left] <= height[right]){
                
                if(leftmax < height[left])leftmax = height[left];
                else total = total + (leftmax - height[left]);
                left++;
            }else{
                
                if(rightmax < height[right])rightmax = height[right];
                else total = total + (rightmax - height[right]);
                right--;
            }
        }
        return total;

    }
}
