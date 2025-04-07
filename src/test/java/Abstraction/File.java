package Abstraction;

public abstract class File {
    abstract void open();
    public void edit(){
        System.out.println("Edit");

    };
    public void close(){
        System.out.println("Close");
    };
    String name;
    String size;


}
