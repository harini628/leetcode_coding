class Solution(object):
    def removeElement(self, nums, val):
        k = 0
        for i in range (len(nums)):
            if(nums[i] != val):
                nums[k] = nums[i]
                k = k + 1
        return k

obj = Solution()
obj.removeElement([3,2,2,3],3)
obj.removeElement([0,1,2,2,3,0,4,2],2)
