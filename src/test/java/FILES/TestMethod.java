package FILES;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class TestMethod {
    public static void main(String[] args) throws IOException {
        List<Map<String, String>> Data= Method.readExcelFiles("C:\\Users\\35269\\Downloads\\Employees.xlsx","Sheet1");
        System.out.println(Data.get(6));

    }
}
