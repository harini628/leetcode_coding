class Solution(object):
    def containsDuplicate(self, nums):
        for i in range(1,len(nums)-1):
            nums.sort()
            if(nums[i]==nums[i-1]):
                return True
        return False
       
obj = Solution()
obj.containsDuplicate([1,2,3,1])
obj.containsDuplicate([1,2,3,4])
obj.containsDuplicate([1,1,1,3,3,4,3,2,4,2])
