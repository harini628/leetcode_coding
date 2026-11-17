class Solution {
    public int reversePairs(int[] nums) {
        return mergeSort(nums,0,nums.length-1);
    }
    public int mergeSort(int[] arr,int low,int high){
        int count = 0;
        if(low >= high) return count;
        int mid = (low+high)/2;
        count += mergeSort(arr,low,mid);
        count += mergeSort(arr,mid+1,high);
        count += merge(arr,low,mid,high);
        return count;
    }

    public int merge(int[] nums,int low,int mid,int high){
        int i=low;int j = mid+1;int n=0;int count = 0;
        int index = mid+1;
        int[] temp = new int[high-low+1];
        while(i<=mid && j <= high){
            if(nums[i] <= nums[j]){
                temp[n++] = nums[i];
                while(index <= high && nums[i] > nums[index]*2L){
                    count += mid - i + 1;
                    index++;
                }
                i++;
            }else{
                temp[n++] = nums[j];
                j++;
            }
        }
        while(i<=mid){
            temp[n++] = nums[i];
            while(index <= high && nums[i] > nums[index]*2L){
                    count += mid - i + 1;
                    index++;
            }
            i++;
        }
        while(j<=high)temp[n++] = nums[j++];
        for(int x=0;x<n;x++)nums[low++] = temp[x];
        return count;
    }
}
