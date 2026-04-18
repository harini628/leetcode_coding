class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> romanToIntegerMap = new HashMap<Character,Integer>();
        romanToIntegerMap.put('I',1);
        romanToIntegerMap.put('V',5);
        romanToIntegerMap.put('X',10);
        romanToIntegerMap.put('L',50);
        romanToIntegerMap.put('C',100);
        romanToIntegerMap.put('D',500);
        romanToIntegerMap.put('M',1000);
        int result = 0;

        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if( (i != s.length()-1) && (
            (c == 'I' && (s.charAt(i+1) == 'V' || s.charAt(i+1) == 'X')) || 
            (c == 'X' && (s.charAt(i+1) == 'L' || s.charAt(i+1) == 'C' )) || 
            (c == 'C' && (s.charAt(i+1) == 'D' || s.charAt(i+1) == 'M')) 
            )){
                result = result - romanToIntegerMap.get(c);
            }else{
                result = result + romanToIntegerMap.get(c);
            }
        }
        return result;
        
    }
}
