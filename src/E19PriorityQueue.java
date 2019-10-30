/*
 * Example demonstrating the use of a priority queue.
 * This example WILL NOT WORK. It uses the MyPQueue class. I have
 * removed the implementation of this class since it would give away
 * crucial components of the PA.
 */
public class E19PriorityQueue {

    public static void main(String[] args) {
        Student adrian = new Student("Adrian", Student.Year.SENIOR);
        Student boyu = new Student("Boyu", Student.Year.JUNIOR);
        Student caroline = new Student("Caroline", Student.Year.FRESHMAN);
        Student carlito = new Student("Carlito", Student.Year.SOPHOMORE);
        Student emily = new Student("Emily", Student.Year.SENIOR);

        MyPQueue pq = new MyPQueue();
        pq.enqueue(adrian, adrian.getPriority());
        pq.enqueue(boyu, boyu.getPriority());
        pq.enqueue(caroline, caroline.getPriority());
        pq.enqueue(carlito, carlito.getPriority());
        pq.enqueue(emily, emily.getPriority());

        System.out.println(pq);

        while (!pq.isEmpty()) {
            System.out.println(pq.dequeue());
        }
    }

}
