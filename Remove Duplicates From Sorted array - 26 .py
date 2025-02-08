class Solution(object):
    def removeDuplicates(self, nums):
        if not nums:
            return 0
        
        unique_index = 0  
        
        for i in range(1, len(nums)):
            if nums[i] != nums[unique_index]:
                unique_index += 1
                nums[unique_index] = nums[i]  
        return unique_index + 1  

obj = Solution()
nums1 = [1, 1, 2]
k1 = obj.removeDuplicates(nums1)
nums2 = [0, 0, 1, 1, 1, 2, 2, 3, 3, 4]
k2 = obj.removeDuplicates(nums2)

