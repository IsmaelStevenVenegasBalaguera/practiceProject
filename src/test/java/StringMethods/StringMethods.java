package StringMethods;

public class StringMethods {

    public static void main(String[] args) {
        String str="Batch 17 is great.";
        int count=0;
        for (int i = 0; i <str.length() ; i++) {
            if (str.charAt(i)=='a'){
                count++;
            }

        }
        System.out.println(count);
    }
}
