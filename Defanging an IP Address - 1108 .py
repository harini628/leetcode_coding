class Solution(object):
    def defangIPaddr(self, address):
        res = ""
        for i in address:
            if (i == "."):
                res = res + "[.]"
            else:
                res = res + i
        return res
obj = Solution()
obj.defangIPaddr("1.1.1.1")
obj.defangIPaddr("255.100.50.0")
