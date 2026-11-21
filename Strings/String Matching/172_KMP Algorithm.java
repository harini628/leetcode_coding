class Solution {
    public List<Integer> search(String pat, String txt) {
        List<Integer> result = new ArrayList<>();
        int[] lsp = new int[pat.length()];int r = 0;
      
        //to find longest suffix/prefix : 
        //longest suffix pattern :
        for(int i=1;i<pat.length();i++){
            if(i>r){
                r = i;
                if(pat.charAt(r) == pat.charAt(r-i))lsp[i] = 1; 
                while(r < pat.length() && pat.charAt(r) == pat.charAt(r-i) ){
                    r++;
                }
                r--; 
            }
            else{
                lsp[i] = lsp[i-1]+1;
            }
        }
      
        // using kmp algorithm finding the index at which string pattern match.
        int j=0;int i=0;
        while(i<txt.length()){
            char t = txt.charAt(i);
            char p = pat.charAt(j);
            if(t == p){
                i++;j++;
                if(j == pat.length()){
                    result.add(i - j);
                    j=lsp[j-1];
                }
            }else{
                if(j != 0)j = lsp[j-1];
                else i++;
            }
           
        }
        return result;
    }
}
