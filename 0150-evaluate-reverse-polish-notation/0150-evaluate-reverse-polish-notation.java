class Solution {
    private boolean isDigit(String token){
        try{
            Integer.parseInt(token);
            return true;
        } catch(Exception e){
            return false;
        }
    }
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack=new Stack<>();
        for(String token:tokens){
            if(isDigit(token)){
                stack.push(Integer.parseInt(token));
            } else {
                int b=stack.pop();
                int a=stack.pop();

                if(token.equals("+")){
                    stack.push(a+b);
                } else if(token.equals("-")){
                    stack.push(a-b);
                } else if(token.equals("*")){
                    stack.push(a*b);
                } else if(token.equals("/")){
                    stack.push(a/b);
                }
            }
        }
        return stack.peek();
    }
}