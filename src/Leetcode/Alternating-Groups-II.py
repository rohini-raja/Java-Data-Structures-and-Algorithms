class Solution:
    def numberOfAlternatingGroups(self, colors: List[int], k: int) -> int:
        for i in range(k-1):
            colors.append(colors[i])
        
        length = len(colors)
        result = 0
        #intializing the bounds of the sliding window
        left = 0
        right = 1

        #sliding window
        while right < length:
            if colors[right] == colors[right-1]:
                #pattern is breaking here, so reset it from current position
                left = right
                right+=1
                continue
            #Extend the window
            right+=1
            if right - left < k:
                continue

            result+=1
            left+=1
        return result