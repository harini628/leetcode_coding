class Solution {
    public boolean isPalindrome(String s) {
        String str = "";
        s = s.toLowerCase();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if((c >= 'a' && c<='z') || (c >= '0' && c<= '9'))str += c;
        }
        String rev = new StringBuilder(str).reverse().toString();
        return str.equals(rev);
    }
}
