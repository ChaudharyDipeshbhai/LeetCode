class Solution:
    def addDigits(self, num: int) -> int:
        if num < 10:
            return num
        return self.addDigits(self.add(num))
    
    def add(self, num: int) -> int:
        if num < 10:
            return num
        return num % 10 + self.add(num // 10)