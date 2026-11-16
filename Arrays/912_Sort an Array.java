class Solution {
    public int[] sortArray(int[] nums) {
        mergeSort(nums,0,nums.length-1);
        return nums;
    }
    public void mergeSort(int[] arr,int low,int high){
        if(low >= high)return;
        int mid = (low+high)/2;
        mergeSort(arr,low,mid);
        mergeSort(arr,mid+1,high);
        merge(arr,low,mid,high);
    }
    public void merge(int[] arr,int low,int mid,int high){
        int[] temp = new int[high-low+1];int n=0;
        int i = low;
        int j = mid + 1;
        while(i<=mid && j<=high){
            if(arr[i] < arr[j]){
                temp[n] = arr[i]; 
                i++;
            }else{
                temp[n] = arr[j];
                j++;
            }
            n++;
        }
        while(i<=mid){
            temp[n++] = arr[i++];
        }
        while(j<=high){
            temp[n++] = arr[j++];
        }
        for(int m=0;m<n;m++){
            arr[low] = temp[m];
            low++;
        }
    }
}
