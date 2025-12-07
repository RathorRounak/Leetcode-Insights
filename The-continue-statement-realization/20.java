import java.util.*;
class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] c = s.toCharArray();
        if(c.length ==1) return false;

        if(c[0]==')' || c[0]==']' || c[0]== '}') return false;

        for(int i =0;i<c.length;i++){

            if(c[i]=='(' || c[i]=='[' || c[i]== '{'){
                stack.push(c[i]);
                
            }
            if(stack.isEmpty()) return false;
               
              if(c[i]==')' || c[i]==']' || c[i]=='}'){
                 if(number(stack.peek())==number(c[i])){
                stack.pop();
               }
               else{
                return false;
               }
              }
        }

        return stack.isEmpty();
        
    }
    public static int number(char c){
        if(c=='(' || c==')') return 0;
        if(c=='{' || c=='}') return 1;
        if(c=='[' || c==']') return 2;

        return -1;
    }
}