class Solution {
    public boolean isAnagram(String s, String t) {
        boolean result = false;
        String a = s.toUpperCase();
        String b = t.toUpperCase();
        int[] arr_a = new int[91];
        int[] arr_b = new int[91];
        if(s.length() == t.length()){
            for(int i=0;i<a.length();i++){
                char x = a.charAt(i);
                arr_a[x]++;
                char y = b.charAt(i);
                arr_b[y]++;
            }
        for(int j=65;j<=90;j++){
            if(arr_a[j] != arr_b[j]){
                result = false;
                break;
            }
            result = true;
        }
        }
        
        return result;
    }
}
