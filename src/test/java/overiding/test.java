package overiding;

public class test extends overiding1child {

    public test(String name, String color, int age) {
        super(name, color, age);
    }

    public static void main(String[] args) {
        overiding1child c= new overiding1child("Keny","blue", 23);
        c.printInfo();
    }
}
