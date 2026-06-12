class Solution {
    public int lengthOfLastWord(String s) {
        boolean flag = false;
        int count = 0;
        for(int i=s.length()-1;i>=0;i--){
            char x = s.charAt(i);
            if(x == ' ' && count>0){
                break;
            }
            if(x != ' ' && flag){
                flag = false;
            }
            if(x==' ' && i == s.length()-1){
                flag = true;
            }
            if(!flag){
                count++;
            }
        }
        return count;
    }
}
