
public class E26LambdaForReuse {

    public static void main(String[] args) {
        System.out.println("======= data");
        int[] data = { 1, 2, 3, 4, 5, 23, 1, 45, 5 };
        addOne(data);
        timesTwo(data);
        capMinZero(data);
        // how could we print all of the elements in the array?
        
        System.out.println("\n======= data2");
        int[] data2 = { 1, 2, 3, 4, 5, 23, 1, 45, 5 };
        processArray(data2, (int x)->{ int y = x+1; 
           System.out.print(" " + y); return y; });
        processArray(data2, (x)->x*2);
        processArray(data2, (x) -> (x < 0) ? 0 : x);
    }
    public static void processArray(int[] data, ElemLambda func) {
        for (int i = 0; i < data.length; i++) {
            data[i] = func.process(data[i]);
        }
    }
    public static void addOne(int[] data) {
        for (int i = 0; i < data.length; i++) {
            data[i] = data[i] + 1;
            System.out.print(" " + data[i]);
        }
    }
    public static void timesTwo(int[] data) {
        for (int i = 0; i < data.length; i++) {
            data[i] = data[i] * 2;
        }
    }
    public static void capMinZero(int[] data) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] < 0) {
                data[i] = 0;
            }
        }
    }

}
