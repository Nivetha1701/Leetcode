class Solution {
    public int countPrimes(int n) {
        if(n<2)
        {
            return 0;
        }
        boolean prime[]=new boolean[n];
        Arrays.fill(prime,true);
        for(int i=2;i*i<n;i++)
        {
            if(prime[i])
            {
                for(int j=i*i;j<n;j+=i)
                {
                    prime[j]=false;
                }
            }
        }
        int count=0;
        for(int i=2;i<n;i++)
        {
            if(prime[i])
            {
                count++;
            }
        }
        return count;
    }
}



// class Solution {
//     public int countPrimes(int n) {
//         int count=0;
//         if(n<3)
//         {
//             count=0;
//         }
//         else 
//         {
//             for(int i=2;i<=n;i++)
//             {
//                 if(isPrime(i))
//                 {
//                     count++;
//                 }
//             }
//         }
//         return count;
//     }
//     private static boolean isPrime(int a)
//     {
//         if(a<2)
//         {
//             return false;
//         }
//         for(int i=2;i*i<=a;i++)
//         {
//             if(a%i!=0)
//             {
//                 return true;
//             }
//         }
//         return false;
//     }
// }