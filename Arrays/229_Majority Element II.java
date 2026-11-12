class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int num1 = Integer.MIN_VALUE;
        int count1 = 0;
        int num2 = Integer.MIN_VALUE;
        int count2 = 0;
        List<Integer> result = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(count1 == 0 && num2 != nums[i]){
                num1 = nums[i];
                count1++;
            }else if(count2 == 0 && num1 != nums[i]){
                num2 = nums[i];
                count2++;
            }else if(nums[i] == num1)count1++;
            else if(nums[i] == num2)count2++;
            else{
                count1--;
                count2--;
            }
        }
        int c1=0;int c2=0;
        for(int j=0;j<nums.length;j++){
            if(num1 == nums[j])c1++;
            if(num2 == nums[j])c2++;
        }
        
        if(c1 > nums.length/3)result.add(num1);
        if(c2 > nums.length/3)result.add(num2);
        
        return result;
    }
}
