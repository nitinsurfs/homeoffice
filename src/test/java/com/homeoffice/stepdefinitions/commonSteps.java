package com.homeoffice.stepdefinitions;

import com.homeoffice.service.DirectoryReaderService;
import cucumber.api.java.en.Given;
import jxl.Sheet;
import jxl.Workbook;

import java.io.FileInputStream;

/**
 * Created by nitinm on 18/07/2017.
 */
public class commonSteps {

    public static Vehicle v;

    @Given("^I load the data from row \"([^\"]*)\" of vehicle registration details file$")
    public void i_load_the_data_from_row_of_vehicle_registration_details_file(String arg1) throws Throwable {
        String FilePath = "./files/Vehicle-data.xls";
        DirectoryReaderService d = new DirectoryReaderService("./files");
        String f = d.retrieveDataFilesWithSupportedMimeType();

        FileInputStream fs = new FileInputStream(FilePath);
        Workbook wb = Workbook.getWorkbook(fs);
        int row = Integer.parseInt(arg1);
        // TO get the access to the sheet
        Sheet sh = wb.getSheet("Sheet1");
        v = new Vehicle(Integer.parseInt(sh.getCell(0, row).getContents()), sh.getCell(1, row).getContents(), sh.getCell(2, row).getContents(), sh.getCell(3, row).getContents());
        System.out.println(v.toString());
    }

}
