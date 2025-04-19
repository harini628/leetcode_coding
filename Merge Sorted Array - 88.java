class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int x = 0;
        int size = m+n;
        for(int i = m ; i<size ; i++ ){
            if(x < n){
                nums1[i] = nums2[x];
                x++;
            }
        }
        int temp;
        for(int i = 0; i<size ; i++ ){
            for(int j = i+1 ; j<size ; j++){
                if(nums1[i] > nums1[j]){
                    temp = nums1[i];
                    nums1[i] = nums1[j];
                    nums1[j] = temp;
                }
            }
        }
    }
    
}
