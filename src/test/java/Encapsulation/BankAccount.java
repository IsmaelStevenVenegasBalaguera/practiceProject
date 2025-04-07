package Encapsulation;

public class BankAccount {
    private String name;
    final private long bankAccountNumber;
    private double balance;
    final private String username;
    private String password;
    final private String accountType;

    public BankAccount(String name, long bankAccountNumber, double balance, String username, String password, String accountType) {
        this.name = name;
        this.bankAccountNumber = bankAccountNumber;
        this.balance = balance;
        this.username = username;
        this.password = password;
        this.accountType = accountType;
    }
    public BankAccount(long bankAccountNumber, String username, String password, String accountType){
        this.bankAccountNumber=bankAccountNumber;
        this.username=username;
        this.password=password;
        this.accountType=accountType;
    }

    public BankAccount(String username,long bankAccountNumber,  String accountType){
        this.bankAccountNumber=bankAccountNumber;
        this.username=username;
        this.accountType=accountType;
    }
    public String getName(){
        return name;
    }
    public String getPassword(){
        return password;
    }
    public long getBankAccountNumber(){
        return bankAccountNumber;
    }

    void setName(String name){
        this.name=name;
    }

}
