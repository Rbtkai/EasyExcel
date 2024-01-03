package org.example;

import com.alibaba.excel.EasyExcel;
import org.example.Listener.ExcelListener;
import org.example.entity.ReadEntity;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String flieName = "C:\\Users\\vip20\\Desktop\\3月18日接诉即办工单信息.xlsx";
        EasyExcel.read(flieName, ReadEntity.class, new ExcelListener())
                .headRowNumber(3)
                .sheet()
                .doRead();
    }
}
