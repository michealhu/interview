package com.interview.question016;

import com.interview.question004.Words;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.json.JSONArray;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

import static com.interview.other.Contants.*;
import static com.interview.utils.ExcelUtils.setCellValue;


/**
 * 第 0016 题： 纯文本文件 numbers.txt, 里面的内容（包括方括号）如下所示：
 */
public class NumberJson2Xls {

    public static final String NUMBER_TXT = "numbers.txt";
    public static final String NUMBER_XLS = "numbers.xlsx";
    public static final String SHEET_NAME = "numbers";

    public static void convertJson2Xls() throws IOException {
        String json = Words.readFile(new File(INPUT_JSON_PATH + NUMBER_TXT));
        JSONArray jsonArray = new JSONArray(json);

        try (OutputStream os = new FileOutputStream(OUTPUT_XLS_PATH + NUMBER_XLS)) {
            write2Excel(jsonArray.toList(), os);
        }

    }

    private static void write2Excel(List<Object> students, OutputStream os) throws IOException {

        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet(SHEET_NAME);

        int size = students.size();
        for (int i = 0; i < students.size(); i++) {
            Row row = sheet.createRow(--size);
            List<String> jsonArray = (List<String>) students.get(i);
            for (int j = 0; j < jsonArray.size(); j++) {
                Cell cell = row.createCell(j);
                setCellValue(cell, jsonArray.get(j));
            }
        }
        workbook.write(os);
    }


}
