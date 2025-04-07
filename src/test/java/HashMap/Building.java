package HashMap;

import java.util.HashMap;

public class Building {

    public static void main(String[] args) {
        HashMap<Integer, String> companies= new HashMap<>();
        companies.put(1,"Google");
        companies.put(2,"Amazon") ;
        companies.put(3,"Facebook");
        companies.put(4,"Coca cola");
        companies.put(5,"RiseRecords");
        companies.put(6,"Pepsi");
        companies.put(7,"Labello");
        System.out.println(companies.size());
        companies.replace(4,"Fanta");
        companies.remove(7);
        companies.forEach((k,v)-> System.out.println(k+ " " +v));
    }
}
