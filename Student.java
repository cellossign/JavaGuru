public class Student {
    private String name;

    public Student(String name) {
        this.name = name + "!!";
    }

    public String getName() {
        System.out.println(name);
        return name;

    }
}
