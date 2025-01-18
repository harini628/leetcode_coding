class Solution(object):
    def buildArray(self, nums):
        arr=[]
        for i in nums:
            n = nums[i]
            arr.append(n)
        return arr
        
obj = Solution()
obj.buildArray([0,2,1,5,3,4])
obj.buildArray([5,0,1,2,3,4])
