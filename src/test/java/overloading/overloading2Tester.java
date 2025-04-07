package overloading;

public class overloading2Tester {
    public static void main(String[] args) {
        overloading2 c=new overloading2();
        c.message();
        c.message("Java");

        System.out.println(c.message());
        System.out.println(c.message("java"));
    }
}
