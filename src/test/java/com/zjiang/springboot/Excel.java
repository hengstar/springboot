package com.zjiang.springboot;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
public class Excel {
    /*
     * author:命运的信徒
     * date:2019-07-31
     * arm:通过java程序往excel里面续写数据
     */
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            excelAdd(i);
        }
    }

    public static void excelAdd(int i){
        String url="D:\\123.xls";
        FileInputStream fs;
        try {
            fs = new FileInputStream(url);
            POIFSFileSystem ps=new POIFSFileSystem(fs); //使用POI提供的方法得到excel的信息
            HSSFWorkbook wb=new HSSFWorkbook(ps);
            HSSFSheet sheet=wb.getSheetAt(0); //获取到工作表，因为一个excel可能有多个工作表
            HSSFRow row=sheet.getRow(0);
            int hang=0;
            if("".equals(row)||row==null){
                hang=0;
            }else{
                hang=sheet.getLastRowNum();
                hang=hang+1;
            }
            //分别得到最后一行的行号，和一条记录的最后一个单元格
            FileOutputStream out=new FileOutputStream(url); //向d://test.xls中写数据
            row=sheet.createRow((short)(hang)); //在现有行号后追加数据
                row.createCell(0).setCellValue("安徽"+i); //设置第一个（从0开始）单元格的数据
                row.createCell(1).setCellValue("安庆"+i);
                row.createCell(2).setCellValue("安楠"+i);
                row.createCell(3).setCellValue("安西"+i);
            //设置第二个（从0开始）单元格的数据
            out.flush();
            wb.write(out);
            out.close();
            System.out.println(row.getPhysicalNumberOfCells()+" "+row.getLastCellNum());
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } //获取d://test.xls

    }
}




