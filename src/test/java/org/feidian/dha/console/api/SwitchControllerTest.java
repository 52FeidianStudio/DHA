package org.feidian.dha.console.api;

import java.util.HashMap;

import org.feidian.dha.console.response.Meta;
import org.feidian.dha.console.response.Response;
import org.feidian.dha.console.service.DhaConfigService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.slf4j.Logger;

/**
 * @author xunjiu
 * @date 2022/5/9 15:16
 **/
class SwitchControllerTest {
    @Mock
    DhaConfigService dhaConfigService;
    @Mock
    Logger log;
    @InjectMocks
    SwitchController switchController;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void testGetDataSource() {
        Response result = switchController.getDataSource();
        Assertions.assertEquals(new Response(new Meta(Integer.valueOf(0), "message"), new HashMap<String, Object>() {{
            put("String", "data");
        }}), result);
    }

    @Test
    void testSwitchDataSource() {
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme