package overloading;

public class findMinimumTester {
    public static void main(String[] args) {
        findMinimumClass c= new findMinimumClass();
        c.findMinimum(1.5,5.2);
        System.out.println(c.findMinimum(1.5,5.2));
        c.findMinimum(99,23);
        System.out.println(c.findMinimum(99,23));
    }
}
