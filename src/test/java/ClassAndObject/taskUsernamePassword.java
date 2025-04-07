package ClassAndObject;

public class taskUsernamePassword {
    public static void main(String[] args) {
        String username="Chocho07";
        String password= "ElChochoNegro";
        String confirmPassword="ElChochoNegro";
        System.out.println(username.isEmpty());
        System.out.println(password.isEmpty());


        if (password.length()<8){
            System.out.println("Password is too short");
        }
        System.out.println(password.length());

        if (password.contains(username)){
            System.out.println("Password contains username");

        }

        if (password.contains(confirmPassword)) {
            System.out.println("successful");
        } else{
            System.out.println("Passwords do not match");
        }

    }
}
