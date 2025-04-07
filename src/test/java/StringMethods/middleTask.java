package StringMethods;

public class middleTask {
    public static void main(String[] args) {
        String str="rosquitas";

        if (str.length()%2!=0&&str.length()>3){
            int middle=str.length()/2;
            System.out.println(str.charAt(middle));
        }

        String derecho="Corazon";
        StringBuffer reverse= new StringBuffer(derecho);
        reverse.reverse();
        System.out.println(reverse);
        String reversed="";
        for (int i = derecho.length()-1; i >=0; i--) {
            reversed=reversed+derecho.charAt(i);

        }
        System.out.println(reversed);





    }
}
