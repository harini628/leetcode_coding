class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        /*
        Set<List<Integer>> resultSet = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            Set<Integer> numSet = new HashSet<>();
            for(int j=i+1;j<nums.length;j++){
                int k = -(nums[i] + nums[j]);
                if(numSet.contains(k)){
                    List<Integer> tripletsArray = new ArrayList<>();
                    tripletsArray.add(nums[i]);
                    tripletsArray.add(nums[j]);
                    tripletsArray.add(k);
                    Collections.sort(tripletsArray);
                    resultSet.add(tripletsArray);
                }
                numSet.add(nums[j]);
            }
        }
        return new ArrayList<>(resultSet);
        */
        
        //OPTIMIZED SOLUTION 
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(i>0 && nums[i] == nums[i-1])continue;
            int j = i+1;
            int k = nums.length-1;
            while(j<k){
                int sum = nums[i]+nums[j]+nums[k];
                if(sum == 0){
                    List<Integer> tripletsList = new ArrayList<>();
                    tripletsList.add(nums[i]);
                    tripletsList.add(nums[j]);
                    tripletsList.add(nums[k]);
                    result.add(tripletsList);
                    j++;
                    while(j<k && nums[j] == nums[j-1])j++;
                    while(j<k && k <nums.length-1 && nums[k] == nums[k+1])k--;
                    
                }else if(sum < 0)j++;
                else if(sum > 0)k--;
                
            }
        }
        return result;
    }
}
