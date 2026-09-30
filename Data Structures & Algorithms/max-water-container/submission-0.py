class Solution:
    def maxArea(self, heights: List[int]) -> int:
        i=0
        j = len(heights) -1
        maxH = 0    
        indices1 = 0
        indices2 = 0
        prod = 0
        while i<j:
            # print('j,i: ',heights[j],heights[i])
            prod = min(heights[j],heights[i]) * (j-i)
            if prod > maxH:
                indices1 = i
                indices2 = j
                maxH = prod
            if heights[j]>heights[i]:
                i = i +1
            else:
                j = j-1
        return maxH
        
            
            
            
            

        