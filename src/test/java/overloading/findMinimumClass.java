package overloading;

public class findMinimumClass {

    public int findMinimum(int numA, int numB){
        if (numA<numB){
            return numA;

        } else {
            return numB;
        }
    }
    public double findMinimum(double numA, double numB){
        if (numA<numB){
            return numA;

        } else {
            return numB;
        }
    }
}
