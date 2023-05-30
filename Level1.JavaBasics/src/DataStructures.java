import java.util.Stack;
public class DataStructures {
    public static void main(String[] args) {
        reverseString(new char[]{'h', 'e', 'l', 'l', 'o'});
        System.out.print(isValid("(){}[]6"));
    }

    public static void reverseString(char[] s) {
        System.out.println(s);

        int index = 0;
        int length = s.length - 1;

        while(index < length) {
            char current = s[index];
            s[index] = s[length];
            s[length] = current;
            index += 1;
            length -= 1;
        }

        System.out.println(s);
    }
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        s.chars().forEach( c -> stack.push((char) c));
        var isValid = true;

        while (!stack.empty()) {
           var current = stack.pop();

           if (current == ')') {
               isValid = stack.pop() == '(';
           } else if (current == ']') {
               isValid = stack.pop() == '[';
           } else if (current == '}') {
               isValid = stack.pop() == '{';
           } else {
               isValid = false;
           }

            if (!isValid) {
               break;
           }
       }

        return isValid;
    }
}
