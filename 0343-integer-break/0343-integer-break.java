class Solution {
    public int integerBreak(int n) {
        // Base cases
        if (n == 2) return 1;
        if (n == 3) return 2;

        int product = 1;

        // Keep multiplying by 3 while n > 4
        while (n > 4) {
            product *= 3;
            n -= 3;
        }

        // Multiply remaining n
        product *= n;

        return product;
    }
}
