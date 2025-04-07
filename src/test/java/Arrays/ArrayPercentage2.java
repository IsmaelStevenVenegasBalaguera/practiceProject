package Arrays;

import java.util.Arrays;

public class ArrayPercentage2 {
    public static void main(String[] args) {
        int [] ages= {12, 15 ,16,25,18,17};
        for (int i = 0; i < ages.length; i++) {
            if (ages[i]%2==0){
                System.out.println(ages[i]);
            }

        }
        System.out.println(Arrays.stream(ages).sum());
        int sum=0;
        for (int i = 0; i < ages.length; i++) {
            sum=sum+ages[i];


        }
        System.out.println(sum);
    }
}
