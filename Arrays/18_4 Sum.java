class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1])continue;
            for (int j = i + 1; j < nums.length; j++) {
                if(j>i+1 && nums[j] == nums[j-1])continue;
                int l = j + 1;
                int k = nums.length - 1;
                while (l < k && l<nums.length && l>=0 && k<nums.length && k>=0) {
                    long sum = nums[i] + nums[j] ;
                    sum += nums[l];
                    sum += nums[k];
                    if (sum == target) {
                        List<Integer> quadrupletsList = new ArrayList<>();
                        quadrupletsList.add(nums[i]);
                        quadrupletsList.add(nums[j]);
                        quadrupletsList.add(nums[l]);
                        quadrupletsList.add(nums[k]);
                        result.add(quadrupletsList);
                        l++;k--;
                        while (l < k && nums[l] == nums[l - 1])l++;
                        while (l < k && k < nums.length - 2 && nums[k] == nums[k + 1])k--;
                    } else if (sum < target) l++;
                    else k--;
                }
            }
        }
        return result;
    }
}
