package org.feidian.dha.console.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.feidian.dha.console.domain.DhaLogicGroup;

/**
 * @author xunjiu
 * @date 2022/3/26 16:25
 **/
@Mapper
public interface DhaLogicGroupMapper {
    int deleteByPrimaryKey(Long id);

    int insert(DhaLogicGroup record);

    int insertSelective(DhaLogicGroup record);

    DhaLogicGroup selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(DhaLogicGroup record);

    int updateByPrimaryKey(DhaLogicGroup record);
}