class Solution {
    public int climbStairs(int n) {
        int a = 0;
        int b = 1;
        int result = a + b;
        while(n>0){
            result = a + b;
            a = b;
            b = result;
            n--;
        }
        return result;
    }
    
}
