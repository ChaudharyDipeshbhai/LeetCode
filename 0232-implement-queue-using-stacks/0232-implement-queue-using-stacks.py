class MyQueue:

    def __init__(self):
        self.object = []

    def push(self, x: int) -> None:
        self.object.append(x)

    def pop(self) -> int:
        toPop = self.object[0]
        self.object = self.object[1:]
        return toPop

    def peek(self) -> int:
        return self.object[0]

    def empty(self) -> bool:
        return len(self.object) == 0


# Your MyQueue object will be instantiated and called as such:
# obj = MyQueue()
# obj.push(x)
# param_2 = obj.pop()
# param_3 = obj.peek()
# param_4 = obj.empty()