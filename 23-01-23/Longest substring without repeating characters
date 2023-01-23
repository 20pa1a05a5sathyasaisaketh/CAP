class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        if len(s)==1: 
            return 1
        count,res=0,''
        for i in s:
            if i not in res:
                res+=i
            else:
                res=res[res.index(i)+1:] + i
            if len(res) > count:
                count=len(res)
        return count
