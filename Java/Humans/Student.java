public class Student extends Human {
    private double gpa;

    public static String school = "Northeastern";

    public Student (int a, double g, String n) {
        super(n, 0, 0, a);
        gpa = g;
    }
    public String toString() {
        return "Student " + getName() + " has GPA " + gpa + " and is " + getAge() + " years of age";
    }
}
