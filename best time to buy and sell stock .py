class Solution(object):
    def maxProfit(self, prices):
        profit_array = []
        res = 0 
        for i in range(len(prices)-1):
            loop = i + 1
            while(loop<len(prices)):
                if(prices[i]<prices[loop]):
                    profit = prices[loop]-prices[i]
                    profit_array.append(profit)
                loop = loop + 1
        for k in profit_array:
            if(res < k):
                res = k
        return res

obj = Solution()
obj.maxProfit([7,1,5,3,6,4])
