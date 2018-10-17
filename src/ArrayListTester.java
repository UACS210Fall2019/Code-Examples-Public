// Allison Obourn
// CSC 210 - lecture 16
// Client program to test the ArrayList functionality

public class ArrayListTester {
   public static void main(String[] args) {
      ArrayList<Integer> list = new ArrayList<>();
      list.add(3);
      list.add(5);
      list.add(7);    
      list.add(23);
      System.out.println(list);
      list.add(1, 42);
      System.out.println(list);
   }
}
