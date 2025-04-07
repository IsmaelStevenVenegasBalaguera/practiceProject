package Arrays;

public class Breaks {

    public static void main(String[] args) {
        int[] nums={10,23,25,56,45,20};
        for (int x:nums){
            if (x==45){
                System.out.println("found");
                break;

            }
        }
    }

}
