class Solution {
    public int fib(int n) {
        if (n<=2){
            if(n==0){
                return 0;
            }
            return 1;
        }
        return fib(n-1)+fib(n-2);
    }
}