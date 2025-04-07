package Methods;

public class Method1Basics {
    void addition(int num1, int num2){
        int result= num1+num2;
        System.out.println(result);
    }

    void larger (int num1, int num2){
        if (num1>num2){
            System.out.println(num1);
        }else {
            System.out.println(num2);
        }
    }

    public static void main(String[] args) {
        Method1Basics firstExample= new Method1Basics();
        firstExample.addition(25,76);

        Method1Basics secondTask= new Method1Basics();
        secondTask.larger(99,65);
    }
}
