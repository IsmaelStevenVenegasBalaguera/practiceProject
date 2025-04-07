package Exceptions;

public class ArithmeticNull {
    public static void main(String[] args) {
        System.out.println(1);
        try{
            System.out.println(10/0);
        }catch(ArithmeticException e){
            System.out.println("Do not divide per 0");

        }
        catch (NullPointerException e){
            System.out.println("Make sure there is not a null value");
        }

        try{
            String meta=null;
            System.out.println(meta.length());
        }catch(ArithmeticException e){
            System.out.println("Do not divide per 0");

        }
        catch (NullPointerException e){
            System.out.println("Make sure there is not a null value");
        }
        System.out.println(2);
    }
}
