
public class Student {
    // Fields
    private String name;
    private int id;

    private static int universityID;

    // Constructor
    public Student(String name) {
        this.name = name;
        this.id = getStudentID();
    }

    private static int getStudentID() {
        int currentID = universityID;
        universityID++;
        return currentID;
    }

    public String toString() {
        return name + " has an id " + id;
    }

    public int hashCode() {
        return id;
    }

}
