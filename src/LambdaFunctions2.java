public class LambdaFunctions2 {

    private static int static_var = 3;
    
    public static void main(String[] args) {
       
        System.out.println("\n==== useAddUs( (x,y) -> x+y );");
        useAddUs( (x,y) -> x+y );
        
        System.out.println("\n==== useAddUs( (p1,p2) -> p1+p2+local_var );");
        int local_var = 1;
        useAddUs( (p1,p2) -> p1+p2+local_var );

        System.out.println("\n==== useAddUs( (p1,p2) -> p1+p2+static_var );");
        useAddUs( (p1,p2) -> p1+p2+static_var );
        
        System.out.println("\n==== useAddUs( with_static );");
        AddUs with_static = (v,w)->v+w+static_var;
        static_var = 9;
        useAddUs(with_static);

        System.out.println("\n==== useAddUs( with_local );");
        AddUs with_local = (v,w)->v+w+local_var;
        //local_var = 99;
        useAddUs(with_local);
    }
    

    private static void useAddUs(AddUs adder) {
        System.out.println("adder.add(24, 5)="+adder.add(24, 5));
    }
    
    public interface AddUs {
        public int add(int a, int b);
    }
}
