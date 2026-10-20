class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer,Integer> nums1Map = new HashMap<>();
        Map<Integer,Integer> nums2Map = new HashMap<>();
        int[] arr = new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            if(!nums1Map.containsKey(nums1[i])){
                nums1Map.put(nums1[i] ,0);
            }
            nums1Map.put(nums1[i] ,nums1Map.get(nums1[i])+1);
        }
        for(int i=0;i<nums2.length;i++){
            if(!nums2Map.containsKey(nums2[i])){
                nums2Map.put(nums2[i] ,0);
            }
            nums2Map.put(nums2[i] ,nums2Map.get(nums2[i])+1 );
        }
        int x =0;
        for(int key : nums1Map.keySet()){
            if(nums2Map.containsKey(key)){
                int count = ( nums1Map.get(key) > nums2Map.get(key) )?nums2Map.get(key):nums1Map.get(key);
                for(int n=0;n<count;n++){
                    arr[x] = key;
                    x++;
                }
            }
        }
        int[] result = new int[x];
        for(int a=0;a<x;a++){
            result[a] = arr[a];
        }
        return result;
    }
}

// optimized code

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer,Integer> nums1Map = new HashMap<>();
        int[] arr = new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            if(!nums1Map.containsKey(nums1[i])){
                nums1Map.put(nums1[i] ,0);
            }
            nums1Map.put(nums1[i] ,nums1Map.get(nums1[i])+1);
        }
        int x =0;
        for(int i=0;i<nums2.length;i++){
            if(nums1Map.containsKey(nums2[i]) && nums1Map.get(nums2[i]) !=0 ){
                arr[x] = nums2[i];
                nums1Map.put(nums2[i],nums1Map.get(nums2[i])-1 );
                x++;
            }
        }
        int[] result = new int[x];
        for(int a=0;a<x;a++){
            result[a] = arr[a];
        }
        return result;
    }
}
