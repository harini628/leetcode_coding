class Solution(object):
    def twoSum(self, nums, target):
        add = 0
        arr = []
        for i in range(len(nums)-1):
            for j in range(i+1,len(nums)):
                add = nums[i] + nums [j]
                if(target == add):
                    arr.append(i)
                    arr.append(j)
                    break
        return arr   
           
obj = Solution()
obj.twoSum([2,7,11,15],9)
obj.twoSum([3,2,4],6)
obj.twoSum([3,3],6)
