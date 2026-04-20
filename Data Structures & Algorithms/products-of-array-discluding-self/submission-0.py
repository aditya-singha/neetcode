class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        if len(nums) == 2:
            return [nums[1], nums[0]]
        
        prefix_arr = self.prefix(nums)
        suffix_arr = self.suffix(nums)
        return self.combine(prefix_arr, suffix_arr, len(nums))
    
    def prefix(self, array: List[int]) -> List[int]:
        prefixArray = [1]
        for i in range(len(array) - 1):
            prefixArray.append(prefixArray[-1] * array[i])
        return prefixArray
    
    def suffix(self, array: List[int]) -> List[int]:
        suffixArray = [1] * len(array)
        for i in range(len(array) - 2, -1, -1):
            suffixArray[i] = suffixArray[i + 1] * array[i + 1]
        return suffixArray
    
    def combine(self, prefixArray: List[int], suffixArray: List[int], arraylength: int) -> List[int]:
        finalArray = []
        for i in range(arraylength):
            finalArray.append(prefixArray[i] * suffixArray[i])
        return finalArray