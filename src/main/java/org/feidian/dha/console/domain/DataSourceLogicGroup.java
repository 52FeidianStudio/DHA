package org.feidian.dha.console.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author xunjiu
 * @date 2022/3/21 23:43
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DataSourceLogicGroup {
    /**
     * 中心结点 —— 读写
     */
    private DhaDatasource centerDatasource;

    /**
     * 灾备结点 —— 只读
     */
    private DhaDatasource standbyDataSource;
}
