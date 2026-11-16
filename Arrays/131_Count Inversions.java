class Solution {
    public long numberOfInversions(int[] nums) {
        return mergeSort(nums,0,nums.length-1);
    }

    public long mergeSort(int[] arr,int low,int high){
        long count = 0;
        if(low >= high)return count;
        int mid = (low+high)/2;
        count += mergeSort(arr,low,mid);
        count += mergeSort(arr,mid+1,high);
        count += merge(arr,low,mid,high);
        return count;
    }
    public long merge(int[] arr,int low,int mid,int high){
        int[] temp = new int[high-low+1];int n=0;
        int i = low;
        int j = mid + 1;
        long count = 0;
        while(i<=mid && j<=high){
            if(arr[i] <= arr[j]){
                temp[n] = arr[i]; 
                i++;
            }else{
                count += mid-i+1;
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
        return count;
    }
}
