/*
Given two strings, one is a text string, text, and the other is a pattern string, pattern. Print the indexes of all occurrences of the pattern string in the text string using the Z function algorithm. Use 0-based indexing while returning the indices.

Example 1:
Input: text = "xyzabxyzabxyz", pattern = "xyz"
Output: 0 5 10
Expalanation : The pattern "xyz" occurs three times in text, starting at indices 0, 5, and 10.

Example 2:
Input: text = "cabcdab", pattern = "abc"
Output: 1
Expalanation : The pattern "abc" occurs one time in text, starting at index 1.
*/

class Solution {
    public List<Integer> search(String text, String pattern) {
        List<Integer> result = new ArrayList<>();
        String str = pattern + "$" + text;
        int left =0;int right = 0;
        int[] Zarray = new int[str.length()];
        for(int i=1;i<str.length();i++){
            if(i>right){
                right = i;left = i;
                while(right<str.length() && str.charAt(right - left) == str.charAt(right)){
                    right++;
                }
                Zarray[i] = right - left;
                right--;
            }else{
                int k =  i - left;
                //if(Zarray[k] < right - i + 1 ){
                if(i + Zarray[k] < right){
                    Zarray[i] = Zarray[k];

                }else{
                    left = i;
                    while(right<str.length() && str.charAt(right - left) == str.charAt(right)){
                        right++;
                    }
                    Zarray[i] = right - left;
                    right--;

                }
            }

        }
        for(int x = pattern.length()+1;x<str.length();x++){
            if(Zarray[x] == pattern.length()) result.add(x - pattern.length()-1);
        }
        
        return result;
    }
}
