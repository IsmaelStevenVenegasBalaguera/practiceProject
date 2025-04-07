package StringMethods;

public class t3 {
    static String onlyVowels(String inputTxt){
        String vowels=inputTxt.replaceAll("[^aeiouAEIOU]", "");
        return vowels;

    }
}
