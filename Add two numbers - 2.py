class Solution(object):
    def addTwoNumbers(self, l1, l2):
       s1 = ""
       s2 = ""
       for i in range (len(l1)-1 , 0 , -1):
          s1 = s1 + str(l1[i])
       for j in range (len(l2)-1 , 0 , -1):
           s2 = s2 + str(l2[j])
       add = int(s1) + int(s2)
       add_str = str(add)
       res = []
       for k in range (len(add_str)-1,0,-1):
            res.append(add_str[k])
       return res

obj = Solution()
obj.addTwoNumbers([2,4,3],[5,6,7])
obj.addTwoNumbers([0],[0])
obj.addTwoNumbers([9,9,9,9,9,9,9],[9,9,9,9])
