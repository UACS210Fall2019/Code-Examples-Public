
public class E06DigitsSortedExample {

    public static void main(String[] args) {

        int twoDigitNum = 342;

        int onesDigit = twoDigitNum % 10;
        System.out.println(onesDigit);

        int tensDigit = twoDigitNum / 10;
        System.out.print(tensDigit);
    }

}
