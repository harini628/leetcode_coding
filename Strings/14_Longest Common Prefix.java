class Solution {
    public String longestCommonPrefix(String[] strs) {
        String result = "";
        int length = strs[0].length();
        for(String s : strs){
            length = (length > s.length())?s.length() : length; 
        }
        for(int i=0;i<length;i++){
            boolean flag = true;
            char x = strs[0].charAt(i);
            for(String str : strs){
                if(x != str.charAt(i)){
                    flag = false;
                    break;
                }
            }
            if(flag)result = result + x;
            else break;
        }
        return result;
        
    }
}
