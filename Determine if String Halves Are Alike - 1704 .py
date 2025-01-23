class Solution(object):
    def halvesAreAlike(self, s):
        n = len(s)/2
        a = ""
        b = ""
        count_a ,count_b = 0,0
        for i in range(len(s)):
            if (i < n):
                a = a + s[i]
            else:
                b = b + s[i]
        v = ["a","e","i","o","u","A","E","I","O","U"]
        for j in a:
            for k in v:
                if(j == k):
                    count_a += 1
        for x in b:
            for y in v:
                if(x==y):
                    count_b +=1
        return count_a == count_b

obj = Solution()
obj.halvesAreAlike("book")
obj.halvesAreAlike("textbook")    
