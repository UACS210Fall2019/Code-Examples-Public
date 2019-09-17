/*
 * This class is used to show that Tyler can't spell Pterodyctal
 */
public class E07Dinosaur {

    private String name;
    private int age;
    private String color;

    public E07Dinosaur(String inputName, int age, String color) {
        name = inputName;
        this.age = age;
        this.color = color;
    }

    public E07Dinosaur() {
        this.name = "Trex";
        this.age = 0;
        this.color = "Green";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.isEmpty()) {
            this.name = name;
        }
    }

    public void happyBirthday() {
        age = age + 1;
    }

    public String toString() {
        return "Dino's name: " + name + " is " + age + " years old and color "
                + color;
    }

}
