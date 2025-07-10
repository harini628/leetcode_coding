class Solution {
    public int strStr(String haystack, String needle) {
        int i=0;
        boolean flag=true;
        int res=-1;
        while(i < haystack.length() && flag){
            char x = haystack.charAt(i);
            if(x == needle.charAt(0)){
                int y=i;
                for(int j=0;j<needle.length();j++){
                    if(haystack.length() == y)break;
                    if(haystack.charAt(y) != needle.charAt(j)){
                        break;
                    }else if(j==needle.length()-1){
                        res=i;
                        flag = false;
                    }
                    y++;
                }
            }
            i++;
        }
        return res;
    }
}
