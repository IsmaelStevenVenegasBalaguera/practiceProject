package Arrays;

public class ArrayCountNunmers {

    public static void main(String[] args) {
        int [] conds={10,20,4,3,8,48,96};

        int count=0;
        /*for (int i = 0; i < conds.length ; i++) {
            if(conds[i]>10){
                count++;
            }

        }
        System.out.println(count);*/
        for (int x:conds){
            if (x>10){
                count++;
            }
        }
        System.out.println(count);
    }
}
