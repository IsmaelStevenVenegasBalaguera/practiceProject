package Arrays;

public class Array2Loop {

    public static void main(String[] args) {
        String [] fruits={"Orange", "Banana", "Kiwi", "Coconut", "Strawberry"};
        fruits[2]="Mango";

        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i]);

        }
    }
}
