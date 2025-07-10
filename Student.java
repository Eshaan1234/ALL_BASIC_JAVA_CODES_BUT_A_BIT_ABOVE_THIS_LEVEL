public class Student {
    String name;

    Student(String n) {
        name = n;
    }

    public static void main(String[] args) {
        Student s1 = new Student("Eshaan");
        System.out.println(s1.name);
    }
}
