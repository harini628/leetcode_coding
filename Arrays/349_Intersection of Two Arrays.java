import java.util.*;
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> arrlist = new ArrayList<>();
       for(int i=0;i<nums1.length;i++){
         for(int j=0;j<nums2.length;j++){
            if(nums1[i] == nums2[j]){
                if(arrlist.size() == 0){
                    arrlist.add(nums1[i]);
                }else{
                  
                for(int k=0;k<arrlist.size();k++){
                    if(nums1[i] == arrlist.get(k)){
                        break;
                    }else if(k == arrlist.size()-1){
                        arrlist.add(nums1[i]);
                    }
                }
                }
            }
         }
       }
       int[] arr = new int[arrlist.size()];
       for(int x=0;x<arrlist.size();x++){
        arr[x] = arrlist.get(x);
       }
       return arr;
    }
    
}
