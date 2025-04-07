package Arrays;

public class Array2FindLargest {
    public static void main(String[] args) {
        int[] nums={10,77,25,56,60,20};

        int largest=0;
        for (int x:nums){
            if (x>largest&& x%2==0){
                largest=x;
            }
        }
        System.out.println(largest);
    }
}
