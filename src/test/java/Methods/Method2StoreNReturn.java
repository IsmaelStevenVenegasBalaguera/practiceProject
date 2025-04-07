package Methods;

public class Method2StoreNReturn {

    int add(int num1, int num2){
        int result=num1+num2;
        return result;
    }

    public static void main(String[] args) {
        Method2StoreNReturn method1= new Method2StoreNReturn();
        method1.add(22,78);
        int sum= method1.add(25,25);
        System.out.println(sum);
    }
}
