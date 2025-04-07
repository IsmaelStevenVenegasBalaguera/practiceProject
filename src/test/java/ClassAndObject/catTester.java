package ClassAndObject;

public class catTester {
    public static void main(String[] args) {
        Cat Pandora= new Cat();
        Pandora.weight=12;
        Pandora.age=12;
        Pandora.color="Grey and White blend";
        Pandora.eyeColor="Green";
        Pandora.sounds();
        System.out.println(Pandora.color);
        System.out.println(Pandora.eyeColor);
    }
}
