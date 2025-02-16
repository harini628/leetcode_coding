class Solution(object):
    def merge(self, nums1, m, nums2, n):
        arr =  []
        for i in range(m):
            arr.append(nums1[i])
        for j in range(n):
            arr.append(nums2[j])
        y = 1
        for x in range(len(arr)-1):
            if(arr[x]>arr[y]):
                arr[x] = arr[x] + arr[y]
                arr[y] = arr[x] - arr[y]
                arr[x] = arr[x] - arr[y]
            y = y + 1
        return arr
obj = Solution()
obj.merge([1,2,3,0,0,0],3,[2,5,6],3)
