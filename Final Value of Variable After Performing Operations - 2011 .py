class Solution(object):
    def finalValueAfterOperations(self, operations):
        X = 0
        for i in operations:
            if (i == "++X" or i == "X++"):
                X = X + 1
            else:
                X = X - 1
        return X

obj = Solution()
obj.finalValueAfterOperations(["--X","X++","X++"])
obj.finalValueAfterOperations(["++X","++X","X++"])
obj.finalValueAfterOperations(["X++","++X","--X","X--"])
        
