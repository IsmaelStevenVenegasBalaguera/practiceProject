package StringMethods;

public class t1ReverseWords {
    public static void main(String[] args) {
        String str="This is the sentence I want to reverse";
        String [] arr=str.split(" ");
        for (int i = arr.length-1; i >= 0; i--) {
            System.out.print(arr[i]+" ");


        }
        System.out.println();


        String ttt= "live is shorter than you think";
        reverseStr(ttt);

        System.out.println();

        reversingeachword(ttt);
    }

    static String reverseStr(String inputStr){
        String reversed=inputStr;
        String [] arr= reversed.split(" ");
        for (int i = arr.length-1; i >=0 ; i--) {
            System.out.print(arr[i]+ " ");

        }

        return reversed;

    }

    static String reversingeachword( String inputStr){
        String reverse= inputStr;
        for (int i = reverse.length()-1; i >=0; i--) {
            System.out.print(reverse.charAt(i));

        }
        return reverse;
    }


    }

