class Solution(object):
    def plusOne(self, digits):
        st = ""
        for i in digits:
            st += str(i)
        a = int(st) 
        b = a + 1
        arr = []
        i = -1
        while (b != 0):
            r = b % 10
            arr.insert(i,r)
            b = b // 10
            i = i - 1
        return arr
        

obj = Solution()
obj.plusOne([4, 3, 2, 1])  
obj.plusOne([9])  
