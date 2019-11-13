import java.util.HashMap;
import java.util.Map;

public class E22Memoization {

    /*
     * This map stores the results of function calls so you don't need to waste
     * your time calling a function with an input you have already used!
     * Remember HashMaps have O(1) constant time, that is fast!
     */
    private static Map<Integer, Integer> memo = new HashMap<Integer, Integer>();

    public static void main(String[] args) {
        System.out.println(fib(25));
    }

    private static int fib(int n) {
        if (memo.containsKey(n)) {
            return memo.get(n);
        }
        if (n < 0) {
            throw new IllegalArgumentException("Argument cannot be negative.");
        } else if (n == 0 || n == 1) {
            return n;
        } else {
            System.out.println("Called fib(" + n + ")");
            int result = fib(n - 1) + fib(n - 2);
            memo.put(n, result);
            return result;
        }
    }

}
