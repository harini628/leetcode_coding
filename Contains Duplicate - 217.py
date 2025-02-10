class Solution(object):
    def containsDuplicate(self, nums):
        nums.sort()
        sol = False
        if (len(nums)==1):
            return sol
        for i in range(len(nums)):
            if(nums[i]==nums[i-1]):
                sol = True
                break
        return sol
obj = Solution()
obj.containsDuplicate([1,2,3,1])
obj.containsDuplicate([1,2,3,4])
obj.containsDuplicate([1,1,1,3,3,4,3,2,4,2])
