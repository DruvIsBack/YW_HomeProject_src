/*
 * Decompiled with CFR 0_132.
 * 
 * Could not load the following classes:
 *  org.apache.poi.ss.usermodel.Cell
 *  org.apache.poi.ss.usermodel.DateUtil
 *  org.apache.poi.ss.usermodel.Row
 *  org.apache.poi.xssf.usermodel.XSSFRow
 *  org.apache.poi.xssf.usermodel.XSSFSheet
 *  org.apache.poi.xssf.usermodel.XSSFWorkbook
 */
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelConverter {
    private String input;
    private String n;
    private XSSFWorkbook a;

    private boolean e(String string) {
        try {
            int n2;
            FileOutputStream fileOutputStream = new FileOutputStream(new File(this.n));
            Object object = new File(this.input);
            object = new FileInputStream((File)object);
            this.a = new XSSFWorkbook((InputStream)object);
            XSSFWorkbook xSSFWorkbook = new XSSFWorkbook();
            XSSFSheet xSSFSheet = xSSFWorkbook.createSheet("Data");
            Object object2 = this.a.getSheetAt(0);
            Iterator iterator = object2.iterator();
            Object object3 = (Row)iterator.next();
            List<String> list = new ArrayList<String>();
            object3 = object3.cellIterator();
            int n3 = 0;
            int n4 = 0;
            ArrayList<Object> arrayList = new ArrayList<Object>();
            while (object3.hasNext()) {
                object2 = (Cell)object3.next();
                ++n4;
                list.add(object2.getStringCellValue());
                if (!string.equals(object2.getStringCellValue())) continue;
                n3 = object2.getColumnIndex();
            }
            arrayList.add(list);
            while (iterator.hasNext()) {
                list = new ArrayList();
                object3 = (Row)iterator.next();
                object3.cellIterator();
                string = "";
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
                int n5 = 0;
                while (n5 < n4) {
                    object2 = object3.getCell(n5);
                    if (object2 != null && object2.getCellType() == 0) {
                        n2 = (int)object2.getNumericCellValue();
                        if (DateUtil.isCellDateFormatted((Cell)object2)) {
                            list.add(object2 == null ? "" : simpleDateFormat.format(object2.getDateCellValue()));
                        } else {
                            list.add(object2 == null ? "" : String.valueOf(n2));
                        }
                    } else {
                        list.add(object2 == null ? "" : object2.getStringCellValue());
                    }
                    if (object2 != null && object2.getColumnIndex() == n3) {
                        string = object2.getStringCellValue();
                    }
                    ++n5;
                }
                n5 = 0;
                while (n5 < string.split(",").length) {
                    object2 = new ArrayList(list);
                    object2.remove(n3);
                    object2.add(n3, string.split(",")[n5]);
                    arrayList.add(object2);
                    ++n5;
                }
            }
            int n6 = 0;
            while (n6 < arrayList.size()) {
                object3 = xSSFSheet.createRow(n6);
                list = (List)arrayList.get(n6);
                n2 = 0;
                while (n2 < list.size()) {
                    object2 = object3.createCell(n2);
                    object2.setCellValue((String)list.get(n2));
                    ++n2;
                }
                ++n6;
            }
            xSSFWorkbook.write((OutputStream)fileOutputStream);
            fileOutputStream.close();
            object.close();
        }
        catch (FileNotFoundException fileNotFoundException) {
        }
        catch (IOException iOException) {}
        return false;
    }

    public static void main(String[] object) {
        String string = ((String[])object).length == 0 ? "/Users/v4/Downloads/sample.xlsx" : object[0];
        object = ((String[])object).length == 0 ? "email" : object[1];
        ExcelConverter excelConverter = new ExcelConverter();
        String string2 = string;
        ExcelConverter excelConverter2 = excelConverter;
        excelConverter.input = string2;
        string2 = String.valueOf(string.split("\\.")[0]) + "_converted.xlsx";
        excelConverter2 = excelConverter;
        excelConverter.n = string2;
        excelConverter.e((String)object);
    }
}

