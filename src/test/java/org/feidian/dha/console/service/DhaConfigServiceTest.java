package org.feidian.dha.console.service;

import org.feidian.dha.spring.boot.autoconfigure.domain.DataSourceRoleEnum;
import org.feidian.dha.spring.boot.autoconfigure.domain.DhaDataSource;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.slf4j.Logger;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author xunjiu
 * @date 2022/5/9 15:18
 **/
@SpringBootTest
class DhaConfigServiceTest {
    @Mock
    Logger log;
    @InjectMocks
    DhaConfigService dhaConfigService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void testPushConfig() {
        DhaDataSource dataSource = new DhaDataSource();
        dataSource.setAppName("unit_test");
        dataSource.setCurrentRole(DataSourceRoleEnum.MASTER);
        boolean result = dhaConfigService.pushConfig(dataSource);
        assertTrue(result);
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme