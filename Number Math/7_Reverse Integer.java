class Solution {
    public int reverse(int x) {
        int reverseNum = 0;
        while(x != 0){
            int rem = x%10;
            if((reverseNum > Integer.MAX_VALUE/10 || (reverseNum == Integer.MAX_VALUE/10 && rem > 7) )|| 
            ((reverseNum < Integer.MIN_VALUE/10) || (reverseNum == Integer.MIN_VALUE/10 && rem < -8) )){
                return 0;
            }
            reverseNum = reverseNum*10 + rem;
            x = x/10;
        }
        return reverseNum;
    }
}
