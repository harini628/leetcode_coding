class Solution {
    public boolean isPowerOfThree(int n) {
        boolean flag = true;
        if(n == 0 || n < 0){
            return false;
        }
        if(n==1){
            return true;
        }
        while(n > 0){
            if(n%3 == 0){
                n = n/3;
                if(n==1){
                    break;
                }
            }else{
                flag = false;
                break;
            }
        }
        return flag;
    }
}
