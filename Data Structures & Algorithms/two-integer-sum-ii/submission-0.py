class Solution:
    def twoSum(self, numbers: List[int], target: int) -> List[int]:
        i = 0
        j = len(numbers)-1
        res = []
        while i<j:
            
            while  numbers[i]+numbers[j] > target:
                j = j-1
            while numbers[i] + numbers[j] <target:
                i = i+1
            if numbers[i] + numbers[j] == target:
                res.append(i+1)
                res.append(j+1)
                return res
        return res
            

        