class Solution {
    public boolean validPalindrome(String s) {
        char[] arr = s.toCharArray();
        int left = 0, right = arr.length - 1;
        while (left < right) {
            if (arr[left] != arr[right]) {
                return isPal(arr, left + 1, right) || isPal(arr, left, right - 1);
            }
            left++;
            right--;
        }
        return true;
    }
    private boolean isPal(char[] arr, int l, int r) {
        while (l < r) {
            if (arr[l++] != arr[r--]) return false;
        }
        return true;
    }
}

// class Solution {
//     public boolean validPalindrome(String s) {
//         if(isPalindrome(s)) return true;
//         for(int i=0;i<s.length();i++){
//             StringBuilder str=new StringBuilder(s);
//             str.deleteCharAt(i);
//             if(isPalindrome(str.toString())) return true;
//         }
//         return false;
//     }
//     public static boolean isPalindrome(String str){
//         int n=str.length();
//         for(int i=0;i<n;i++){
//             if(str.charAt(i)!=str.charAt(n-i-1)){
//                 return false;
//             }
//         }
//         return true;
//     }
// }