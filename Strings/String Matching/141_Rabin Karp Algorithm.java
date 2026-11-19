/*
Given a string text and a string pattern, implement the Rabin-Karp algorithm to find the starting index of all occurrences of pattern in text. If pattern is not found, return an empty list.

Example 1:
Input: text = "ababcabcababc", pattern = "abc"
Output: [2, 5, 10]
Expalanation : The pattern "abc" is found at indices 2, 5, and 10 in the text.

Example 2:
Input: text = "hello", pattern = "ll"
Output: [2]
Explanation: The pattern "ll" is found at index 2 in the text.
*/

class Solution {
    public List<Integer> search(String pat, String txt) {
        List<Integer> result = new ArrayList<>();
        int windowHash = 0;
        int patternHassh = 0;
        int h = 1;
        int d = 256;
        int modulus = 101;
        
        for(int i=0;i<pat.length();i++){
            if(i>0)h = (h*d) % modulus;
            windowHash = ( (windowHash*d) + txt.charAt(i) ) % modulus;
            patternHassh =  ((patternHassh*d) + pat.charAt(i) ) % modulus;
        }

        for(int x = 0; x <= txt.length() - pat.length();x++ ){
            if(windowHash == patternHassh && pat.equals(txt.substring(x ,pat.length() + x) )){
                result.add(x);
            }
            if(x < txt.length() - pat.length() ){
                int outgoing = txt.charAt(x);
                int incoming = txt.charAt(pat.length() + x);
                windowHash = (d * ( windowHash - (outgoing*h) ) + incoming ) % modulus   ;
            }
            if(windowHash < 0) windowHash += modulus;
        }
        return result;
 
    }
}

