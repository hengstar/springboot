package com.zjiang.springboot;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;

public class AddExcel {
    public static void main(String[] args) throws Exception {
        FileInputStream fs=new FileInputStream(System.getProperty("user.dir") + "\\head.xls");  //获取head.xls
        POIFSFileSystem ps=new POIFSFileSystem(fs);  //使用POI提供的方法得到excel的信息
        HSSFWorkbook wb=new HSSFWorkbook(ps);
        HSSFSheet sheet=wb.getSheetAt(0);  //获取到工作表，因为一个excel可能有多个工作表
        HSSFRow row=sheet.getRow(0);  //获取第一行（excel中的行默认从0开始，所以这就是为什么，一个excel必须有字段列头），即，字段列头，便于赋值
        System.out.println(sheet.getLastRowNum()+" "+row.getLastCellNum());  //分别得到最后一行的行号，和一条记录的最后一个单元格

        FileOutputStream out=new FileOutputStream(System.getProperty("user.dir") + "\\head.xls");  //向head.xls中写数据
        row=sheet.createRow((short)(sheet.getLastRowNum()+1)); //在现有行号后追加数据
        row.createCell(0).setCellValue("hello"); //设置第一个（从0开始）单元格的数据
        row.createCell(1).setCellValue(1); //设置第二个（从0开始）单元格的数据


        out.flush();
        wb.write(out);
        out.close();
        System.out.println(row.getPhysicalNumberOfCells()+" "+row.getLastCellNum());
    }
}

