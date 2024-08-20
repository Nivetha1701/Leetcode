class Solution {
    public int romanToInt(String s) {

        HashMap<Character,Integer> map=new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        int total=0;
        int prev=0;

        for(int i=s.length()-1;i>=0;i--)
        {
            char curr=s.charAt(i);
            int curvalue=map.get(curr);

            if(curvalue<prev)
            {
                total-=curvalue;
            }
            else 
            {
                total+=curvalue;
            }

            prev=curvalue;
        }
        
        return total;
        
    }
}