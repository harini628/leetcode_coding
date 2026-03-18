class Solution {
    public int smallestEvenMultiple(int n) {
        if(n%2 != 0){
            return n*2;
        }else{
            int result = n*2;
            boolean flag = true;
            for(int i=n; flag; i+=n){
                if(i%2 == 0){
                    flag = false;
                    result = i;
                    break;
                }
            }
            return result;
        }
        
    }
}
