package Exceptions;

import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        Scanner scanner=new Scanner(System.in);

        try{
            int size= scanner.nextInt();
            int [] arr= new int[size];
        } catch (Exception e){
            System.out.println("only enter positive numbers");
        };

        System.out.println(4);
        System.out.println(5);
        System.out.println(6);
    }
}
