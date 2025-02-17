class Solution(object):
    def reverse(self, x):
        y = 0
        while(x!=0):
            rem = x%10
            x = x // 10
            y = y*10 + rem
        return y
obj = Solution()
obj.reverse(123)
