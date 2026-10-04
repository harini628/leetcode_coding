class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count = 0;
        for(String str : words){
            boolean flag = false;

            for(int i=0;i<str.length();i++){
                if(! allowed.contains(str.charAt(i) + "")){
                    flag = true;
                    break;
                }
            }
            if(!flag) count++;
        }
        return count;
    }
}
