package org.feidian.dha.console.service.db;

import java.util.List;

import javax.annotation.Resource;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.commons.collections4.CollectionUtils;
import org.feidian.dha.console.domain.DhaDatasource;
import org.feidian.dha.console.mapper.DhaDatasourceMapper;
import org.springframework.stereotype.Service;

/**
 * @author xunjiu
 * @date 2022/3/25 20:48
 **/
@Service
public class DhaDatasourceService {

    @Resource
    private DhaDatasourceMapper dhaDatasourceMapper;

    public int deleteByPrimaryKey(Long id) {
        return dhaDatasourceMapper.deleteByPrimaryKey(id);
    }

    public int insert(DhaDatasource record) {
        List<DhaDatasource> datasources = dhaDatasourceMapper.selectByDataSourceName(record);
        if (CollectionUtils.isEmpty(datasources)) {
            return dhaDatasourceMapper.insert(record);
        } else {
            throw new RuntimeException("duplicate datasource name");
        }
    }

    public int insertSelective(DhaDatasource record) {
        return dhaDatasourceMapper.insertSelective(record);
    }

    public DhaDatasource selectByPrimaryKey(Long id) {
        return dhaDatasourceMapper.selectByPrimaryKey(id);
    }

    public int updateByPrimaryKeySelective(DhaDatasource record) {
        return dhaDatasourceMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(DhaDatasource record) {
        return dhaDatasourceMapper.updateByPrimaryKey(record);
    }

    public PageInfo<DhaDatasource> selectListByPageQuery(Integer pageSize, Integer pageNum) {
        PageHelper.startPage(pageNum, pageSize);
        return new PageInfo<>(dhaDatasourceMapper.selectAll());
    }
}
