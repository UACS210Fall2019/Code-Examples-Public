import java.util.Comparator;
import java.util.PriorityQueue;

public class E30PQueue {

    public static void main(String[] args) {
        Comparator<Student> yearComp = new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.getPriority() - s2.getPriority();
            }
        };
        Comparator<Student> alphComp = new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.getName().compareTo(s2.getName());
            }
        };
        PriorityQueue<Student> q = new PriorityQueue<Student>(yearComp);
        Student a = new Student("a", Student.Year.FRESHMAN);
        Student b = new Student("b", Student.Year.SENIOR);
        Student c = new Student("c", Student.Year.FRESHMAN);
        Student d = new Student("d", Student.Year.JUNIOR);
        Student e = new Student("e", Student.Year.JUNIOR);
        q.add(a);
        q.add(b);
        q.add(c);
        q.add(d);
        q.add(e);

        while (!q.isEmpty()) {
            Student curr = q.poll();
            System.out.println(curr);
        }
    }
}
