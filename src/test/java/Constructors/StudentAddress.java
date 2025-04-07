package Constructors;

import Class4.sout;

public class StudentAddress {
    private String name;
    private String address;

    StudentAddress(String nName, String aAddress){
        name=nName;
        address=aAddress;
    }

    void displayInfo(){
        System.out.println(name+ " "+address);

    }
}
