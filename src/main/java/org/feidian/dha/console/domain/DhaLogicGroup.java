package org.feidian.dha.console.domain;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author xunjiu
 * @date 2022/3/26 16:25
 **/
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DhaLogicGroup implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 逻辑集群主键 id
     */
    private Long id;
    /**
     * 逻辑集群名
     */
    private String logicGroupName;
    /**
     * 中心主节点单元标
     */
    private String centerUnit;
    /**
     * 灾备中心单元标
     */
    private String standByUnit;
    /**
     * 中心数据源id
     */
    private Long centerDatasourceId;
    /**
     * 灾备中心数据源id
     */
    private Long standByDatasourceId;
    /**
     * 当前主节点数据源 id
     */
    private Long currentNode;
    /**
     * 切流状态
     */
    private String switchStatus;
    /**
     * 禁写时间
     */
    private Date forbidWriteTime;
    /**
     * 创建时间
     */
    private Date gmtCreate;
    /**
     * 修改时间
     */
    private Date gmtModified;
}