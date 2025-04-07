package Constructors;

public class Students {
    private String name;
    private double grade1;
    private double grade2;
    private double grade3;

    public Students(String dName, double dGrade1, double dGrade2, double dGrade3){
        name=dName;
        grade1=dGrade1;
        grade2=dGrade2;
        grade3=dGrade3;
    }

    public void calculate(){
        double average= (grade1 + grade2 + grade3) / 3;
        System.out.println(name+"'s score is: "+average);

    }
}
