class Solution(object):
    def reverseString(self, s):
        left , right = 0 , len(s) - 1
        while (left < right ):
            s[left],s[right] = s[right],s[left]
            left = left + 1
            right = right - 1
        return s
obj = Solution()
obj.reverseString(["h","e","l","l","o"])
obj.reverseString(["H","a","n","n","a","h"])
