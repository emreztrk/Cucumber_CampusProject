package StepDefinitions;
import Utilities.WD;
import io.cucumber.java.After;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;


public class Hooks {
    @After
    public void after(){
        WD.quitDriver();
    }

    public List<String> getData(){

        String path = "src/test/java/ApacheExcel/DataRead.xlsx";

        List<String> data=new ArrayList<>();

        Sheet sheet=null;
        try {
            FileInputStream inputStream=new FileInputStream(path);
            Workbook workbook= WorkbookFactory.create(inputStream);
            sheet= workbook.getSheetAt(0);
        }catch (Exception e) {

        }

        for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {

            for (int j = 0; j < sheet.getRow(i).getPhysicalNumberOfCells(); j++) {

                data.add(sheet.getRow(i).getCell(j).toString());

            }

        }
        return data;
    }
}
