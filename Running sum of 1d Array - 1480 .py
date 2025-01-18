class Solution(object):
    def runningSum(self, nums):
        n = 0
        arr=[]
        for i in nums:
            n = n + i
            arr.append(n)
        return arr

obj = Solution()
obj.runningSum([1,2,3,4])      
obj.runningSum([1,1,1,1])
obj.runningSum([3,1,2,10,1])
