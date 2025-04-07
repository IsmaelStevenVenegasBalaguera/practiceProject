package overiding;

public class overiding1
{
    private String name;
    private String color;
    private int age;

    public overiding1(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    void printInfo(){
        System.out.println(name + " " + color + " " + age);
    }
}
