package org.example.entity;

import com.alibaba.excel.converters.Converter;
import com.alibaba.excel.enums.CellDataTypeEnum;
import com.alibaba.excel.metadata.CellData;
import com.alibaba.excel.metadata.GlobalConfiguration;
import com.alibaba.excel.metadata.property.ExcelContentProperty;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Rbtkai
 * @date 2024/1/3 11:44
 * @description:  日期转换
 */
public class DateConverter implements Converter<Date> {

    private static final String DATE_FORMAT_PATTERN_1 = "yyyy-MM-dd HH:mm:ss";
    private static final String DATE_FORMAT_PATTERN_2 = "yyyy/MM/dd";

    @Override
    public Class<?> supportJavaTypeKey() {
        return Date.class;
    }

    @Override
    public CellDataTypeEnum supportExcelTypeKey() {
        return CellDataTypeEnum.STRING;
    }

    @Override
    public Date convertToJavaData(CellData cellData, ExcelContentProperty contentProperty,
                                  GlobalConfiguration globalConfiguration) {
        if (cellData == null || cellData.getStringValue() == null) {
            return null;
        }
        String stringValue = cellData.getStringValue();
        try {
            if (stringValue.contains("-")) {
                return new SimpleDateFormat(DATE_FORMAT_PATTERN_1).parse(stringValue);
            } else if (stringValue.contains("/")) {
                return new SimpleDateFormat(DATE_FORMAT_PATTERN_2).parse(stringValue);
            }
        } catch (Exception e) {
            // 处理解析异常
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public CellData convertToExcelData(Date value, ExcelContentProperty contentProperty,
                                       GlobalConfiguration globalConfiguration) {
        if (value != null) {
            String stringValue = new SimpleDateFormat(DATE_FORMAT_PATTERN_1).format(value);
            return new CellData(stringValue);
        }
        return new CellData("");
    }
}