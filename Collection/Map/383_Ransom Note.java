import java.util.*;

class Solution {
  
    public boolean canConstruct(String ransomNote, String magazine) {
      
        Map<Character,Integer> ransomNoteResult = new HashMap<Character, Integer>();
        Map<Character,Integer> magazineResult = new HashMap<Character,Integer>();
        boolean result = false;
      
        for(char c : ransomNote.toCharArray()){
            if(!ransomNoteResult.containsKey(c)){
                ransomNoteResult.put(c,1);
            }
            ransomNoteResult.put(c,ransomNoteResult.get(c)+1);
        }

        for(char c : magazine.toCharArray()){
            if(!magazineResult.containsKey(c)){
                magazineResult.put(c,1);
            }
            magazineResult.put(c,magazineResult.get(c)+1);
        }

        for(char c : ransomNote.toCharArray()){
            if( magazineResult.containsKey(c) && ( ransomNoteResult.get(c) ==  magazineResult.get(c) ||  ransomNoteResult.get(c) <=  magazineResult.get(c))){
                result = true;
            }else{
                result = false;
                break;
            }
        }
      
        return result;
    }
}
