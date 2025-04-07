package overloading;

public class overloading2 {
    public String message( String str2){
        String str1="I love ";
        String result= str1+str2;
        return result;
    }

    public String message(){
        String result= "I love programming languages";
        return result;
    }
}
