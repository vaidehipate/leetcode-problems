class Solution {
    int[] memo = new int[100]; // Our notebook

    public int fib(int n) {
        if (n <= 1) return n;
        
        // If we already wrote it down, just return it
        if (memo[n] != 0) return memo[n];
        
        // Otherwise, calculate and save it
        return memo[n] = fib(n - 1) + fib(n - 2);
    }
}
