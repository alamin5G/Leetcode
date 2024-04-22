import java.util.Stack;

/**
 * ValidParentheses20
 */
public class ValidParentheses20 {

    public static void main(String[] args) {
        System.out.println(isValid("((){}"));
    }


        public static boolean isValid(String s) {
            Stack<Character> stack = new Stack<>();

            for (char c : s.toCharArray()) {
                if (c== '(') {
                    stack.push(')');
                }else if (c== '{') {
                    stack.push('}');
                }else if (c== '[') {
                    stack.push(']');
                }else if(stack.isEmpty() || stack.pop() != c){
                    return false;
                }

            }

            return stack.empty();
        }
    
}