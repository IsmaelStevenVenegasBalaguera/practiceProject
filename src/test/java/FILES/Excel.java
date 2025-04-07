package FILES;

import io.cucumber.java.ja.且つ;
import org.apache.commons.io.output.BrokenWriter;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Excel {
    public static void main(String[] args) throws IOException {
        String path= "C:\\Users\\35269\\Downloads\\Employees.xlsx";
        FileInputStream fis=new FileInputStream(path);
        XSSFWorkbook workbook= new XSSFWorkbook(fis);
        Sheet sheet= workbook.getSheet("Sheet1");
        List<Map<String, String>> empData= new ArrayList<>();
        Row headerRow= sheet.getRow(0);
        for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
            Row row=sheet.getRow(i);
            Map<String, String> map1=new LinkedHashMap<>();
            for (int j = 0; j < headerRow.getPhysicalNumberOfCells(); j++) {
                String keyData= row.getCell(j).toString();
                String ValueData=row.getCell(j).toString();

                map1.put(keyData,ValueData);

            }
            empData.add(map1);

        }

        System.out.println(empData);



        







    }
}
