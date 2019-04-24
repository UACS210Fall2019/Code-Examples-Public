
public class LambdaExample3 {
	
	public interface Adjuster {
		public abstract void adjust(int i);
	}
	
	public static void main(String[] args) {
		int[] data = {1, 2, 3, 4, 5, 23, 1, 45, 5};
		
		filter(data, (i) -> {
			data[i] = data[i] + 1;
			System.out.println(" " + data[i]);
		});
		
        filter(data, (i) -> data[i] = data[i] * 2);
		
		filter(data, (i) -> {
			if (data[i] < 0) {
				data[i] = 0;
			}
		});
	}
	
	public static void filter(int[] data, Adjuster adjuster) {
		for (int i = 0; i < data.length; i++) {
			adjuster.adjust(i);
		}
	}

}
