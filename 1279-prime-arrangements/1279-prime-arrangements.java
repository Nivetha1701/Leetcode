class Solution {
    public int numPrimeArrangements(int n) {
        int MOD = 1000000007; // we take modulo to avoid large numbers

        // Step 1: Count how many numbers from 1 to n are prime
        int primeCount = 0;
        for (int i = 2; i <= n; i++) { // start from 2 since 1 is not prime
            if (isPrime(i)) {
                primeCount++; // increase count when number is prime
            }
        }

        // Step 2: Count how many numbers are not prime
        int nonPrimeCount = n - primeCount;

        // Step 3: Calculate factorial of primeCount and nonPrimeCount
        long primeFact = factorial(primeCount, MOD);
        long nonPrimeFact = factorial(nonPrimeCount, MOD);

        // Step 4: Multiply both factorials and take modulo
        long result = (primeFact * nonPrimeFact) % MOD;

        // Step 5: Return the final result
        return (int) result;
    }

    // Function to check if a number is prime or not
    private boolean isPrime(int num) {
        if (num <= 1) return false; // numbers less than or equal to 1 are not prime
        for (int i = 2; i * i <= num; i++) { // check divisibility up to square root
            if (num % i == 0) {
                return false; // if divisible, not prime
            }
        }
        return true; // otherwise it's prime
    }

    // Function to find factorial of a number modulo MOD
    private long factorial(int n, int MOD) {
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = (fact * i) % MOD; // multiply and take modulo each time
        }
        return fact;
    }
}
