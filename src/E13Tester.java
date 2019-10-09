
public class E13Tester {

    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();
        for (int i = 0; i < 9; i++) {
            list.add(0, i);
        }
        System.out.println(list);

        list.remove(3);
        System.out.println(list);
        list.remove(6);
        System.out.println(list);

        // MyLinkedList llist = new MyLinkedList();
        // for (int i = 0; i < 9; i++) {
        // llist.add(i);
        // }
        // System.out.println(llist);
    }

}
