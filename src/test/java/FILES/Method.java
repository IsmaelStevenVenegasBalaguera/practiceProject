package FILES;

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

public class Method {

    public static List<Map<String, String>> readExcelFiles(String path, String sheetName) throws IOException {
        FileInputStream file= new FileInputStream(path);
        XSSFWorkbook workbook= new XSSFWorkbook(file);
        List<Map<String,String>> empData= new ArrayList<>();
        Sheet sheet= workbook.getSheet(sheetName);
        Row headRow=sheet.getRow(0);
        for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
            Row row=sheet.getRow(i);
            Map <String, String> map1= new LinkedHashMap<>();
            for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
                String keyValue= row.getCell(j).toString();
                String valueData= row.getCell(j).toString();
                map1.put(keyValue,valueData);

            }
            empData.add(map1);

        }
        return empData;



    }
}
