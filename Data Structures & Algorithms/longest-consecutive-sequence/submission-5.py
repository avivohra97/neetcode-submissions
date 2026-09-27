class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        newS = set(nums)
        if len(nums) == 0:
            return 0
        
        newNums = []
        longest = 0
        for num in nums:
           
            if num - 1 not in newS:
                count = 0
                while num+count in newS:
                    count = count + 1
                longest = max(longest,count)
            


        return longest
        