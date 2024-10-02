class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        Arrays.sort(letters);
        char ans=' ';
        int count=0;
        for(int i=0;i<letters.length;i++)
        {
            if(letters[i]>target)
            {
                ans=letters[i];
                count++;
                break;
            }
        }
        if(count==0)
        {
            return letters[0];
        }
        return ans;
    }
}