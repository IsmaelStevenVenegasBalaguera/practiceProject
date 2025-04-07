package Arrays;

public class Array2SmallestNumber {
    public static void main(String[] args) {
        int[] nums={10,77,25,56,60,20,-10,-5};
        int smallest=nums[0];
        for (int x:nums){
            if (x<smallest){
                smallest=x;
            }

        }
        System.out.println(smallest);
    }
}
