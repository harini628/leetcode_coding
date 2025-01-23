class Solution(object):
    def checkIfPangram(self, sentence):
        res = set(sentence)
        return len(res) == 26
                
obj = Solution()
obj.checkIfPangram("thequickbrownforjumpsoverthelazydog")
obj.checkIfPangram("leetcode")
