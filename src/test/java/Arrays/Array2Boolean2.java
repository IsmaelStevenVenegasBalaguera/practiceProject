package Arrays;

public class Array2Boolean2 {
    public static void main(String[] args) {
        boolean [] booleans= {true, false,true,false,true};
        int count=0;
        for (int i = 0; i < booleans.length; i++) {


            if (booleans[i]){
                System.out.println(booleans[i]);
                count++;

            }


        }
        System.out.println(count);
    }
}
