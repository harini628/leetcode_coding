class Solution(object):
    def findNumbers(self, nums):
        count = 0
        for i in nums:
            c = 0
            
            while (i != 0):
                i = i/10
                c = c + 1
            
            if (c % 2 == 0):
                count = count + 1
        return count

        
obj = Solution()
obj.findNumbers([12,345,2,6,7896])
obj.findNumbers([555,901,482,1771])
