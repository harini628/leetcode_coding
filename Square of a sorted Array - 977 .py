class Solution(object):
    def sortedSquares(self, nums):
        sq = []
        for i in nums:
            r = i**2 
            sq.append(r)
        for j in range (0,len(sq),1):
            for k in range (j+1 ,len(sq),1):
                if (sq[j] > sq[k]):
                    temp = sq[j]
                    sq[j] = sq[k]
                    sq[k] = temp
        print(sq)
obj = Solution()
obj.sortedSquares([-4,-1,0,3,10])
obj.sortedSquares([-7,-3,2,3,11])
