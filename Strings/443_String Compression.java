class Solution {
    public int compress(char[] chars) {
        char prev = chars[0];
        int count = 1;
        String solution = "";
        for(int i=1;i<chars.length;i++){
            if(prev == chars[i]){
                count++;
            }else if(count != 1){
                solution = solution + prev + count;
                count = 1;
            }else{
                solution = solution + prev;
            }
            prev = chars[i];
        }
        if(count == 1){
            solution = solution + prev;
        }else{
            solution = solution + prev + count;
        }
        for(int n=0;n<solution.length();n++){
            chars[n] = solution.charAt(n);
        }
        
        return solution.length();
        
    }
}
