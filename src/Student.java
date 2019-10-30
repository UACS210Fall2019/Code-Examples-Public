/*
 * Student class for the E19PriorityQueue example.
 */
public class Student {

    public enum Year {
        FRESHMAN("Freshman", 4), SOPHOMORE("Sophomore", 3), JUNIOR("Junior",
                2), SENIOR("Senior", 1);

        public final String label;
        public final int yearsLeft;

        private Year(String label, int yearsLeft) {
            this.label = label;
            this.yearsLeft = yearsLeft;
        }
    }

    private String name;
    private Year year;

    public Student(String name, Year year) {
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public Year getYearsLeft() {
        return year;
    }

    public int getPriority() {
        return year.yearsLeft;
    }

    public String toString() {
        return name + " " + year;
    }

}
