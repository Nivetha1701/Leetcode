class Solution {
    public String clearDigits(String s) {
        int n=s.length();
        StringBuilder result=new StringBuilder();
        for(int i=0;i<n;i++)
        {
            char c=s.charAt(i);
            if(Character.isDigit(c))
            {
                if(result.length()>0)
                {
                    result.deleteCharAt(result.length()-1);
                }
            }
            else 
            {
                result.append(c);
            }
        }
        return result.toString();
    }
}