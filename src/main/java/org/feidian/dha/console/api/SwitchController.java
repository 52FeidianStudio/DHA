package org.feidian.dha.console.api;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.feidian.dha.console.response.Response;
import org.feidian.dha.console.response.Responses;
import org.feidian.dha.console.service.DhaConfigService;
import org.feidian.dha.spring.boot.autoconfigure.DhaService;
import org.feidian.dha.spring.boot.autoconfigure.domain.DataSourceRoleEnum;
import org.feidian.dha.spring.boot.autoconfigure.domain.DhaDataSource;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xunjiu
 * @date 2022/3/18 17:57
 **/
@RestController
@RequestMapping("/switch")
@Slf4j
public class SwitchController {
    @Resource
    private DhaConfigService dhaConfigService;
    @Resource
    private DhaService dhaService;

    @GetMapping()
    public Response getDataSource() throws JsonProcessingException {
        DhaDataSource datasource = DhaDataSource.builder()
            .appName("sdf")
            .masterDBConnection("sdf1")
            .standbyDBConnection("sdf2")
            .currentRole(DataSourceRoleEnum.MASTER).build();
        Map<String, DhaDataSource> map = new HashMap<>();
        map.put(datasource.getAppName(), datasource);
        DhaDataSource target = new DhaDataSource();
        BeanUtils.copyProperties(datasource, target);
        target.setAppName("test");
        map.put(target.getAppName(), target);
        ObjectMapper objectMapper = new ObjectMapper();
        log.info("map:{}", objectMapper.writeValueAsString(map));
        boolean success = dhaConfigService.pushConfig(target);
        log.info("push result:{}", success);
        if (!success) {
            return Responses.errorResponse();
        }
        return Responses.successResponse();
    }

    @GetMapping("/dha")
    public void test() {
    }

}
