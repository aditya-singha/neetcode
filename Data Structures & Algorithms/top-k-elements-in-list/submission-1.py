class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        result = []
        if len(nums)!=0:
            freq_map = {}

            for num in nums:
                freq_map[num] = freq_map.get(num,0) +1

            n = len(nums)

            buckets = [[] for _ in range(len(nums)+1)]

            for num, f in freq_map.items():
                buckets[f].append(num)

            for f in range(len(buckets)-1, 0, -1):
                for num in buckets[f]:
                    result.append(num)
                    if len(result) == k:
                        return result





            return result