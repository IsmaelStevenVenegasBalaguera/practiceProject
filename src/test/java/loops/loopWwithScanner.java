package loops;

import java.util.Scanner;

public class loopWwithScanner {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter a start point");
        int start= scanner.nextInt();
        System.out.println("Enter an end point");
        int end= scanner.nextInt();
        System.out.println("Enter a step");
        int step= scanner.nextInt();

        while (start<=end){
            System.out.print(start);
            start+=step;
        }
    }
}
