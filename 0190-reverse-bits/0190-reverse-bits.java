class Solution {
    public int reverseBits(int n) {
        String binary = String.format("%32s", Integer.toBinaryString(n)).replace(' ', '0');
        StringBuilder str=new StringBuilder(binary);
        String s=str.reverse().toString();
        int res=Integer.parseInt(s,2);
        return res;
    }
}