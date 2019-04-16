
public class Lambdas {
	
	public static void main(String[] args) {
		TimeTester test = (int index) -> index = index + 1;
		
        testTime((int index) -> heuristic());
        testTime((int index) -> backtrack());
	}
	
	private static void testTime(TimeTester tester) {
        long startTime = System.nanoTime();
        tester.functionality(5);
        long endTime = System.nanoTime();
        long duration = (endTime - startTime) / 1000000;
        System.out.println(duration + " milliseconds");
	}
	
	public interface TimeTester {
		public void functionality(int index);
	}
	
	
	
	
	private static void heuristic() {
		System.out.println("Hueristic");
		int count = 0;
		while(count < 10) {
			count++;
		}
	}
	
	private static void backtrack() {
		System.out.println("Backtrack");
		int count = 0;
		while(count < Integer.MAX_VALUE - 1) {
			count++;
		}
	}

}
