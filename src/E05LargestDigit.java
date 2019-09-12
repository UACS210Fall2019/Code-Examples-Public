
public class E05LargestDigit {

    public static void main(String[] args) {
        System.out.println(largestDigit(8342116));
        System.out.println(largestDigit(40109));
        System.out.println(largestDigit(-163505));
        System.out.println(largestDigit(0));

    }

    /*
     * This function takes in an integer n and returns
     * the largest single digit from n.
     */
    public static int largestDigit(int n) {
        if (n < 0) {
            return largestDigit(-n);
        } else if (n < 10) {
            return n;
        } else {
            /*
             * Take the recursive leap of faith! Here you wanted to
             * find the largest digit of a number, you are writing that
             * function right here, so use it!
             */
            return Math.max(largestDigit(n / 10), n % 10);
        }
    }

}
