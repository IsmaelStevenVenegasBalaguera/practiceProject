package Class4;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class sout {
    public static void main(String[] args) {
        String Hola = "Hola que tal";
        System.out.println(Hola);

        ArrayList<String> response = new ArrayList<>();
        response.add("Manager:Nicolas");
        response.add("Company: McDonalds");
        System.out.println(response);

       Map<String, Double> groceryShop= new LinkedHashMap<>();
        groceryShop.put("coffee",25.33);
        groceryShop.put("chocolate", 26.2);
        groceryShop.put("vanilla", 16.25);
        groceryShop.put("lemon", 2.11);

        for (Map.Entry<String, Double> grocery:groceryShop.entrySet()){
            if(grocery.getKey().contains("vanilla")){
                grocery.setValue(25.33);
                System.out.println(groceryShop);
            }
        }

        int a=10;
        int b=20;

        a= a+b;
        b= a-b;
        a= a-b;

        System.out.println(a);
        System.out.println(b);
        int i=0;







    }
}
