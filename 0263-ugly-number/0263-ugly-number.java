class Solution {
    public boolean isUgly(int n) {
        if (n <= 0) return false; // Ugly numbers are positive integers
        
        // Define an array of prime factors we are interested in
        int[] primes = {2, 3, 5};
        
        // Continuously divide n by each prime factor
        for (int prime : primes) {
            while (n % prime == 0) {
                n /= prime;
            }
        }
        
        // If the number is reduced to 1, it is an ugly number
        return n == 1;
    }
}
