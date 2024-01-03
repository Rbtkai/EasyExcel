package org.example.Listener;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import org.example.entity.ReadEntity;

/**
 * @author Rbtkai
 * @date 2024/1/3 11:44
 * @description: 监听 实体
 */
public class ExcelListener extends AnalysisEventListener<ReadEntity> {
    @Override
    public void invoke(ReadEntity readEntity, AnalysisContext analysisContext) {
        System.out.println(readEntity.toString());
    }

    @Override
    public void doAfterAllAnalysed(AnalysisContext analysisContext) {
    }
}
