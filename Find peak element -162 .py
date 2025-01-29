class Solution(object):
    def findPeakElement(self, nums):
        n = len(nums)
        large = 0
        for i in range (n-1):
            if (nums[i]<nums[i+1]):
                large = i+1
        return large
obj = Solution()
obj.findPeakElement([1,2,3,1])
obj.findPeakElement([1,2,1,3,5,6,4])
        
