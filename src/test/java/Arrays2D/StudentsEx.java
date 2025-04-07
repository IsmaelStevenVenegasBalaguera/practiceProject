package Arrays2D;

public class StudentsEx {
    public static void main(String[] args) {
        String [][] Students={
                {"Aysha","Giulia","John","Deepali"},
                {"A","B","C","D"}
        };
        for (int i = 0; i < 4; i++) {
            if (Students[1][i].equals("A"))
            System.out.println(Students[0][i]);


            }

        }
    }

