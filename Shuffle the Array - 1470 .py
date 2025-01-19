class Solution(object):
    def shuffle(self, nums, n):
        arr_x = []
        arr_y = []
        arr = []
        for i in range (len(nums)) :
            if (i < n):
                arr_x.append(nums[i])
            else:
                arr_y.append(nums[i])
        
        for j in range (n):
            arr.append(arr_x[j])
            arr.append(arr_y[j])
            
            
        return arr

obj = Solution()
obj.shuffle([2,5,1,3,4,7],3)
obj.shuffle([1,2,3,4,4,3,2,1],4)
obj.shuffle([1,1,2,2],2)
