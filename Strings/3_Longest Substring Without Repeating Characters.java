class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> intset = new HashSet<Character>();
        int max = 0;
        int j = 0;
        for(int i=0;i<s.length();i++){
            while(intset.contains(s.charAt(i))){
                intset.remove(s.charAt(j));
                j++;
            }
            intset.add(s.charAt(i));
            
            if(max < intset.size()){
                max = intset.size();
            }
        }

        return max;

        
    }
}
