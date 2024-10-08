class Solution {
    public List<String> fizzBuzz(int n) {
        
        String s3="Fizz";
        String s5="Buzz";
        String s35="FizzBuzz";
        ArrayList<String> al=new ArrayList<>();
        for(int i=1;i<=n;i++)
        {
            if(i%3==0 && i%5==0)
            {
                al.add(s35);
            }
            else if(i%3==0)
            {
                al.add(s3);
            }
            else if(i%5==0)
            {
                al.add(s5);
            }
            else 
            {
                al.add(String.valueOf(i));
            }
        }
        return al;
    }
}