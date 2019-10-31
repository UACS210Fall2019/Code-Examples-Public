/*
 * We used this file to demonstrate Exceptions: throwing exceptions, try-catch.
 * We also leave a diagram for a callstack at the bottom of the file.
 */
public class E20ExceptionPractice {

    public static void main(String[] args) {
        topFunction();
    }

    public static void topFunction() {
        middleFunction();
    }

    public static void middleFunction() {
        try {
            lastFunction(-2);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void lastFunction(int age) throws IllegalArgumentException {
        if (age < 0) {
            throw new ArithmeticException("Age has to be greater than 0");
        }
        // try {
        // int x = 6 / 1;
        // Scanner y = null;
        // y.hasNext();
        // } catch (ArithmeticException | NullPointerException e) {
        // System.out.println(e.getMessage());
        // }
    }

}
/*
 * This is what the callstack looks like when the exception occurs.
 * Each function gets its own space on the stack to store whatever variables or object
 * references it needs to store.
 * 
 * |--------------------|
 * |                    |
 * |    main            |
 * |                    |
 * |                    |
 * |--------------------|
 * |                    |
 * |    topFunction     |
 * |                    |
 * |                    |
 * |--------------------|
 * |                    |
 * |    middleFunction  |
 * |                    |
 * |                    |
 * |--------------------|
 * |                    |
 * |    lastFunction    |
 * |                    |
 * |                    |
 * |---------------------
 */