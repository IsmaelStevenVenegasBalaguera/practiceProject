package Arrays;

public class Practice {
    public static void main(String[] args) {
        int[] nums = {10,23,25,56,45,20,67};

        int largest=0;
        for (int x:nums){
            if (x%2==0&& x>largest){
                largest=x;

            }
            }
        System.out.println(largest);

        }
    }
