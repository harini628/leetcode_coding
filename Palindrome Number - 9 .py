class Solution(object):
    def isPalindrome(self, x):
        a = str(x)
        b = ""
        for i in range(len(a)-1,-1,-1):
            b = b + a[i]
        if(b == a):
            return True
        else:
            return False
obj = Solution()
obj.isPalindrome(121)
obj.isPalindrome(-121)
obj.isPalindrome(10)
