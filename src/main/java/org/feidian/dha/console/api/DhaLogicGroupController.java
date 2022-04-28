package org.feidian.dha.console.api;

import javax.annotation.Resource;

import org.feidian.dha.console.domain.DhaLogicGroup;
import org.feidian.dha.console.service.db.DhaLogicGroupService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * (dha_logic_group)表控制层
 *
 * @author xxxxx
 */
@RestController
@RequestMapping("/logicGroup")
public class DhaLogicGroupController {
    /**
     * 服务对象
     */
    @Resource
    private DhaLogicGroupService dhaLogicGroupService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public DhaLogicGroup selectOne(Long id) {
        return dhaLogicGroupService.selectByPrimaryKey(id);
    }

}
