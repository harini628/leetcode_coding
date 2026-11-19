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

