class Solution(object):
    def sumOddLengthSubarrays(self, arr):
        total_sum = 0
        n = len(arr)

        for i in range(n):
            for j in range(i, n):
                if (j - i + 1) % 2 == 1:  
                    total_sum += sum(arr[i:j + 1])  

        return total_sum

# Test cases
obj = Solution()
print(obj.sumOddLengthSubarrays([1, 4, 2, 5, 3]))  
print(obj.sumOddLengthSubarrays([1, 2]))          
print(obj.sumOddLengthSubarrays([10, 11, 12]))    
