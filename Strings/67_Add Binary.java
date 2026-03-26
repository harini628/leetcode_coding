class Solution {
    public String addBinary(String a, String b) {
        int length = (a.length() > b.length())?a.length():b.length();
        String result = "";
        int i=a.length()-1;
        int j = b.length()-1;
        char carry = '0';

        while(i>=0 || j>=0 ){
            char Achar = 'a';
            char Bchar = 'b';
            if(i<a.length() && i>=0){
                Achar = a.charAt(i);
                i--;
            }
            if(j < b.length() && j>=0){
                Bchar = b.charAt(j);
                j--;
            }
            if(Achar == '0' && Bchar == '0'){
                if(carry == '1'){
                    result = result + "1";
                    carry = '0';
                }else{
                    result = result + "0";
                }
                

            }else if(Achar == '1' && Bchar == '1'){
                if(carry == '1'){
                    result = result + "1";
                    carry = '1';
                }else{
                    carry = '1';
                    result = result + "0";
                }

            }else if((Bchar == '1') || (Achar == '1')){
                if(carry == '1'){
                    carry = '1';
                    result = result + '0';
                }else{
                    result = result + "1";
                }
            }else if(Achar == 'a' && Bchar == '1' && carry =='1'){
                result = result + "0";
                carry = '1';

            }else if(Achar == '1' && Bchar == 'b' && carry == '1'){
                result = result + "0";
                carry = '1';
            }else if(Achar == 'a' && Bchar == '0' && carry =='1'){
                result = result + "1";
                carry = '0';
            }else if(Achar == '0' && Bchar == 'b' && carry == '1'){
                result = result + "1";
                carry = '0';
            }
            else if(Achar == 'a' && Bchar != 'b'){
                result = result + Bchar ;
            }else if(Achar != 'a' && Bchar == 'b'){
                result = result + Achar;
            }  
            
            
        }
        
        if(carry == '1'){
            result = result + "1";
        }

        //reverse the result
        String actualresult = "";
        for(int n=result.length()-1;n>=0;n--){
            actualresult = actualresult + result.charAt(n);
        }

        return actualresult;
    }
}
