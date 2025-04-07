package StringMethods;

public class swapStrings {
    public static void main(String[] args) {
        String n1="Shawn";
        String n2="Pease";

        n1=n1+n2;
        n2=n1.substring(0,5);
        n1=n1.substring(5,10);
        System.out.println(n1);
        System.out.println(n2);
    }
}
