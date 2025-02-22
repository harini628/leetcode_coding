class Solution(object):
    def isValid(self, s):
        result = False
        count_a , count_b = 0,0
        count_c,count_d=0,0
        count_e,count_f=0,0
        for i in range(len(s)):
            if(s[i]=="("):
                count_a = count_a + 1 
            elif(s[i]==")"):
                count_b = count_b + 1
            elif(s[i]=="["):
                count_c = count_c + 1
            elif(s[i]=="]"):
                count_d = count_d + 1
            elif(s[i]=="{"):
                count_e = count_e + 1
            else:
                count_f = count_f + 1
        if(count_a==count_b and count_c==count_d and count_e == count_f):
            result = True
        




        return result

obj = Solution()
obj.isValid("()")



        
