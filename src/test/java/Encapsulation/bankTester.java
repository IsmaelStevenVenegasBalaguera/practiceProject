package Encapsulation;

public class bankTester {
    public static void main(String[] args) {
        BankAccount bA= new BankAccount("Pedro",1234,78545.22,"User123","Syntax123#","Checking");
        System.out.println(bA.getName());
        System.out.println(bA.getPassword());
        System.out.println(bA.getBankAccountNumber());
        bA.setName("Marcos");
        System.out.println(bA.getName());

    }
}
