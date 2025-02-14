class Solution(object):
    def searchInsert(self, nums, target):
        index , found = 0 , 0
        for i in range(len(nums)):
            if(nums[i]==target):
                index = i
                found = 1
                break
        if (found == 0):
            nums.append(target)
            nums.sort()
            for j in range(len(nums)):
                if(nums[j]==target):
                    index = j
        return index

obj = Solution()
obj.searchInsert([1,3,5,6],5)
obj.searchInsert([1,3,5,6],2)
obj.searchInsert([1,3,5,6],7)
        
     
