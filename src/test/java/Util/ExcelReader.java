package Util;

import org.apache.xpath.operations.String;

public class ExcelReader {


    public static ExcelReader INSTANCE=new ExcelReader();
    java.lang.String testdatafilepath = "src\\test\\resources\\inputdata.xls";

    public java.lang.String getTestdatafilepath() {
        return testdatafilepath;
    }

    public void setTestdatafilepath(String testdatafilepath) {
        this.testdatafilepath = java.lang.String.valueOf(testdatafilepath);
    }



    public static ExcelReader getInstance(){
        return INSTANCE;
    }

}
