class Solution(object):
    def sumOddLengthSubarrays(self, arr):
        total_sum = 0
        n = len(arr)

        for i in range(n):
           
            total_subarrays = (i + 1) * (n - i)
            odd_subarrays = (total_subarrays + 1) // 2

            total_sum += odd_subarrays * arr[i]

        return total_sum

obj = Solution()
print(obj.sumOddLengthSubarrays([1, 4, 2, 5, 3]))  
print(obj.sumOddLengthSubarrays([1, 2]))          
print(obj.sumOddLengthSubarrays([10, 11, 12]))    
