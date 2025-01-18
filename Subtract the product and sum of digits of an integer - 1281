class Solution(object):
    def subtractProductAndSum(self, n):
        add = 0
        mul = 1
        while (n!=0):
            rem = n%10
            add = add + rem
            mul = mul * rem
            n = n/10
        result = mul - add
        return result
            
obj = Solution()
obj.subtractProductAndSum(234)
obj.subtractProductAndSum(4421)
