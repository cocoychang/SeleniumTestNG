package utility;

import org.apache.poi.ss.usermodel.*;
import org.testng.annotations.DataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;

public class ReadExcelData {

    //    public static void main(String[] args) throws IOException {
//        ReadExcelData read = new ReadExcelData();
//        read.getData("sheet1");
//    }
    @DataProvider(name="credentials_data")
    public String[][] getData(Method methodName) throws IOException {

        String excelSheetName = methodName.getName();
        System.out.println(excelSheetName);
        File f = new File(System.getProperty("user.dir") + "/src/test/java/testData/test_data.xlsx");
        FileInputStream fil = new FileInputStream(f);
        Workbook wb = WorkbookFactory.create(fil);
        Sheet sheetName = wb.getSheet(excelSheetName);

        int totalRows = sheetName.getLastRowNum();
        System.out.println(totalRows);
        Row rowCells = sheetName.getRow(0);
        int totalCols = rowCells.getLastCellNum();
        System.out.println(totalCols);

        DataFormatter format = new DataFormatter();

        String testData[][] = new String[totalRows][totalCols];

        for (int i = 1; i <= totalRows; i++) {
            for (int k = 0; k < totalCols; k++) {
                testData[i - 1][k] = format.formatCellValue(sheetName.getRow(i).getCell(k));
                System.out.println(testData[i - 1][k]);

            }
        }
        return testData;
    }
}
