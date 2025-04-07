package Abstraction;

public class tester {
    public static void main(String[] args) {
        File [] arr= {new JavaFile(), new PdfFile(), new WordFile()};
        for(File x:arr){
            x.open();
            x.edit();
            x.close();
        }
    }
}
