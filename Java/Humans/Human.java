public class Human {
    private String name;
    private double height;
    private double weight;
    private int age;

    public Human(String n, double h, double w, int a) {
        name = n;
        height = h;
        weight = w;
        age = a;
    }
    public Human(String n) {
        this(n, 0, 0, 0);
    }
    public String toString() {
        return "Holy shit, it's " + name + ". He is " + height + " inches tall and weighs " + weight + " pounds.";
    }
    public String getName() {
        return name;
    }
    public double getHeight() {
        return height;
    }
    public double getWeight() {
        return weight;
    }
    public int getAge() {
        return age;
    }
}
