class Solution {
    private boolean isOperator(String token){
        return token.equals("+") || token.equals("-") || token.equals("*") 
        || token.equals("/");
    }
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack=new Stack<>();
        for(String token:tokens){
            if(!isOperator(token)){
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
// class Solution {
//     private boolean isOperator(String token){
//         return token.equals("+") || token.equals("-") || token.equals("*") 
//         || token.equals("/");
//     }
//     public int evalRPN(String[] tokens) {
//         Stack<Integer> stack=new Stack<>();
//         for(String token:tokens){
//             if(!isOperator(token)){
//                 stack.push(Integer.parseInt(token));
//             } else {
//                 int b=stack.pop();
//                 int a=stack.pop();

//                 switch(token){
//                 case "+": stack.push(a+b); break;
//                 case "-": stack.push(a-b); break;
//                 case "*": stack.push(a*b); break;
//                 case "/": stack.push(a/b); break;
//                 }
//             }
//         }
//         return stack.peek();
//     }
// }


// class Solution {
//     private boolean isDigit(String token){
//         try{
//             Integer.parseInt(token);
//             return true;
//         } catch(Exception e){
//             return false;
//         }
//     }
//     public int evalRPN(String[] tokens) {
//         Stack<Integer> stack=new Stack<>();
//         for(String token:tokens){
//             if(isDigit(token)){
//                 stack.push(Integer.parseInt(token));
//             } else {
//                 int b=stack.pop();
//                 int a=stack.pop();

//                 if(token.equals("+")){
//                     stack.push(a+b);
//                 } else if(token.equals("-")){
//                     stack.push(a-b);
//                 } else if(token.equals("*")){
//                     stack.push(a*b);
//                 } else if(token.equals("/")){
//                     stack.push(a/b);
//                 }
//             }
//         }
//         return stack.peek();
//     }
// }