package Arrays;

public class Array2LargerNumber {
    public static void main(String[] args) {
        int []nums={10,23,25,56,45,20};

        int largest=0;
        for (int x:nums){
            if (x>largest){
                largest=x;
            }
        }
        System.out.println(largest);

    }
}
