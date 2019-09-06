
/*
 * An example of Stack usage.
 */
import java.util.Stack;

public class E04PrintReverse {

    /*
     * Note this is just the way we did it in class.
     * There are other (possibly better) ways to do
     * this problem.
     */
    public static void main(String[] args) {
        String str = "Hello my name is Inigo Montoya";
        String[] parts = str.split(" ");
        Stack<String> stack = new Stack<String>();
        for (String word : parts) {
            stack.push(word);
        }
        String result = "";
        while (!stack.empty()) {
            result += stack.pop() + " ";
        }
        System.out.println(result);
    }

}
