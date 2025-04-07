package Arrays2D;

import java.awt.font.FontRenderContext;

public class Array2D1 {
    public static void main(String[] args) {
        String [][] names={{"Hind","Mikhail","Ismael","Ahmed"},
                            {"John","Bob","Adam","Tamim"},
                             {"Joke","Laugh","Johnny","Mohammad"},
                            {"Gui","Backend","Front","API"}};

        for (String[]row:names){
            for (String x:row){
                System.out.print(x+" ");
            }
            System.out.println();
        }
        }

    }

