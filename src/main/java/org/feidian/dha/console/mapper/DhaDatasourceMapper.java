package org.feidian.dha.console.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.feidian.dha.console.domain.DhaDatasource;

/**
 * @author xunjiu
 * @date 2022/3/26 16:00
 **/
@Mapper
public interface DhaDatasourceMapper {
    int deleteByPrimaryKey(Long id);

    int insert(DhaDatasource record);

    int insertSelective(DhaDatasource record);

    DhaDatasource selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(DhaDatasource record);

    int updateByPrimaryKey(DhaDatasource record);

    List<DhaDatasource> selectAll();

    List<DhaDatasource> selectByDataSourceName(DhaDatasource record);
}