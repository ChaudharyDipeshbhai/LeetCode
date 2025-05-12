class Solution {
    public int tribonacci(int n) {
        if (n<3){
            if(n == 0)
                return 0;
            return 1;
        }
        // int [] memo = new int [n+1];
        // if (memo[n] != 0){
        //     return memo[n];
        // }
        // memo[n] = tribonacci(n-1)+tribonacci(n-2)+tribonacci(n-3);
        // return memo[n];
        int n1 = 0;
        int n2 = 1;
        int n3 = 1;
        int k = 0;
        for (int i = 3; i<=n; i++){
            k= n1+n2+n3;
            n1 = n2;
            n2 = n3;
            n3 = k;
        }
        return k;
    }
}