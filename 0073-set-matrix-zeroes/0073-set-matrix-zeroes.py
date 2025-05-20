class Solution:
    def setZeroes(self, matrix: List[List[int]]) -> None:
        m = len(matrix)
        n = len(matrix[0])
        zeroes = [[0 for _ in range(n)]for _ in range(m)]
        for i in range(m):
            for j in range(n):
                if matrix[i][j]== 0:
                    zeroes[i][j] = 1
        for i in range(m):
            for j in range(n):
                if zeroes[i][j] == 1:
                    for k in range(n):
                        matrix[i][k] = 0
                    for k in range(m):
                        matrix[k][j] = 0
        return matrix  
        