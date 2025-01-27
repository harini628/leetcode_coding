class Solution(object):
    def countOdds(self, low, high):
        arr = []
        for i in range (low , high+1):
            if (i%2 != 0):
                arr.append(i)
        return len(arr)

obj = Solution()
obj.countOdds(3,7)
obj.countOdds(8,10)
