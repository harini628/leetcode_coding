class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        for(int x = m;x<nums1.length;x++){
            if(x-m < n){
                nums1[x] = nums2[x-m];
            }
        }

        int gap = (nums1.length)/2 + nums1.length%2;
        while(gap>0){
            int i=0;int j = i+gap;
            while(j<nums1.length){
                if(nums1[i] > nums1[j]){
                    int temp = nums1[i];
                    nums1[i] = nums1[j];
                    nums1[j] = temp;
                }
                i++;
                j++;
            }
            if(gap == 1)break;
            gap = (gap)/2 + (gap)%2;
        }
    }
}
