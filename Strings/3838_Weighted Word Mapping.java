class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        String result = "";
        String alphabets = "zyxwvutsrqponmlkjihgfedcba";
        for(String str : words){
            int sum = 0;
            for(int i=0;i<str.length();i++){
                char x = str.charAt(i);
                sum = sum + weights[x-97];
            }
            result = result + alphabets.charAt(sum%26);
        }
        return result;
    }
}
