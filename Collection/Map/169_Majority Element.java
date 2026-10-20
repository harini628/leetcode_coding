class Solution {
    public int majorityElement(int[] nums) {
        int result = 0;
        int count = 0;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],0 );
            }
            map.put(nums[i] , map.get(nums[i])+1);
        }
        for(int key : map.keySet()){
            if(count < map.get(key) ){
                result = key;
                count = map.get(key);
            }
        }
        return result;
    }
}
