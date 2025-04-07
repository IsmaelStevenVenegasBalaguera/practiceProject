package loops;

public class nestedLoopsDiamond {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j <10 ; j++) {

                if(i==1&&(j==2||j==3)){
                    System.out.print(" " + " ");
                } else {
                    System.out.print("*"+ " ");
                }

            }
            System.out.println();
        }
    }
}
