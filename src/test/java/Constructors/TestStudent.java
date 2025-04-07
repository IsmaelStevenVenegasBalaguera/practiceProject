package Constructors;

public class TestStudent {

    public static void main(String[] args) {
        Students student1= new Students("Mark",7.5,8.2,5.6);
        Students student2= new Students("Peter",5.2,7.1,9.3);
        Students student3= new Students("Jan",7.3,8.2,3.9);

        student1.calculate();
        student2.calculate();
        student3.calculate();



    }
}
