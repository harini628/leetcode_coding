class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int minChar = target;
        char result = letters[0];
        for(char ch : letters){
            if(ch > target && (result > ch || target >= result)){
                result = ch;
            }
        }
        return result;
    }
}
