package Constructors;

public class constructor1 {

    private String color;
    private String size;
    private int age;

    constructor1(String dColor, String dSize, int dAge){
        color=dColor;
        size=dSize;
        age=dAge;
    }

    void printInfo(){
        System.out.println(color+" "+size+" "+ age);
    }
}
