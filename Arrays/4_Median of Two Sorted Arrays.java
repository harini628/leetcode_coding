class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] mergeArray = new int[nums1.length+nums2.length];int i=0;int j=0;int index = 0;
        while(i<nums1.length && j< nums2.length){
            if(nums1[i] < nums2[j]){
                mergeArray[index++] = nums1[i++];
            }else{
                mergeArray[index++] = nums2[j++];
            }
        }
        while(i<nums1.length)mergeArray[index++] = nums1[i++];
        while(j< nums2.length)mergeArray[index++] = nums2[j++];
        int mid = 0;
        if(mergeArray.length % 2 == 0){
            mid = mergeArray[mergeArray.length/2] + mergeArray[(mergeArray.length/2) - 1];
            return mid/2.0;
        }else{
            mid = mergeArray[mergeArray.length/2];
        }
        return mid/1.0;
        
    }
}
