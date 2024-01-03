package org.example.entity;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReadEntity {
    @ExcelProperty("序号")
    private String num;
    @ExcelProperty(value = "创建时间", converter = DateConverter.class)
    private Date createTime;
    @ExcelProperty("工单编号")
    private String workOrder;
    @ExcelProperty("标题")
    private String title;
    @ExcelProperty("主要内容")
    private String mainContent;
    @ExcelProperty("问题点位")
    private String problem;
    @ExcelProperty("工单状态")
    private String orderStatus;
    @ExcelProperty("诉求分类1")
    private String appealTypeOne;
    @ExcelProperty("诉求分类2")
    private String appealTypeTwo;
    @ExcelProperty("处理结果")
    private String result;
    @ExcelProperty(value = "来电时间", converter = DateConverter.class)
    private Date callTime;
    @ExcelProperty(value = "派单时间")
    private String orderDeliveryTime;
    @ExcelProperty("处理时限")
    private String solveDay;
    @ExcelProperty(value = "办结时间", converter = DateConverter.class)
    private Date closingTime;
    @ExcelProperty("来电人")
    private String caller;
    @ExcelProperty("来电人电话")
    private String allerNumber;
}
