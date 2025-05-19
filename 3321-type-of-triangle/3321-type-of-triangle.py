class Solution:
    def triangleType(self, nums: List[int]) -> str:
        type = "none"
        if nums[0]+nums[1]<=nums[2] or nums[1]+nums[2]<=nums[0] or nums[0]+nums[2]<=nums[1]:
            return type
        else:
            if nums[0]==nums[1] and nums[1]==nums[2]:
                type = "equilateral"
            elif nums[0]!= nums[1] and nums[1]!= nums[2] and nums[0]!= nums[2]:
                type = "scalene"
            else:
                type = "isosceles"
        return type