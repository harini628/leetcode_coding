class Solution(object):
    def numberOfSteps(self, num):
        i = 0
        while (num != 0):
            i = i + 1
            if (num % 2 == 0):
                num = num / 2
            else:
                num = num - 1
        return i

obj = Solution()
obj.numberOfSteps(14)   
obj.numberOfSteps(8)
obj.numberOfSteps(123)
