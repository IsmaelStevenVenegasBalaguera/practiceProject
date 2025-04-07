package StringMethods;

import Class4.sout;

public class Split {
    public static void main(String[] args) {
        String sentence= "Live is always good if you are positive";
        String newStc=sentence.replaceAll("\\s","");
        System.out.println(newStc);

        int count=0;
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i)=='a'){
                count++;
            }

        }
        System.out.println(count);
    }
}
