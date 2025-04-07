package StringMethods;

public class T2mETHOD {

    int color;
     static int sumUpAll(int [] numbers){

        int sum= 0;
        for (int i = 0; i < numbers.length; i++) {
            sum=sum+numbers[i];

        }
        System.out.println(sum);
        return sum;
    }

     static String singing(String sings){
        String sound= sings;
        System.out.println(sound);
        return sound;
    }
}
