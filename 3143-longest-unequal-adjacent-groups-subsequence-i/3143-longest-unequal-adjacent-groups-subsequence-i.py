class Solution:
    def getLongestSubsequence(self, words: List[str], groups: List[int]) -> List[str]:
        lis = []
        lis.append(words[0])
        for i in range(len(groups)-1):
            if groups[i] != groups[i+1]:
                lis.append(words[i+1])
        return lis

