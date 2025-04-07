package Arrays;

public class Array2EvenNums {
    public static void main(String[] args) {
        int[] nums= {10,23,25,56,45,20};

        for (int x:nums){
            if (x%2==0){
                System.out.println(x);
            }
        }
    }
}
