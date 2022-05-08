package org.feidian.dha.console;

import java.io.IOException;
import java.util.function.Supplier;
import java.util.stream.Stream;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
class DhacApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    public void testException() {
        try {
            Supplier<RuntimeException> runtimeExceptionFunction = RuntimeException::new;
            Supplier<IOException> ioExceptionSupplier = IOException::new;
            Stream.of(1, 2, 3).filter(item -> false).findFirst()
                .orElseThrow(runtimeExceptionFunction);
            //Stream.of(1, 2, 3).filter(item -> false).findFirst()
            //    .orElseThrow(ioExceptionSupplier);
        } catch (Exception e) {
            throw e;
        }
    }

    private void testThrowUnCheckedException() {
        throw new RuntimeException();
    }

    private void testThrowCheckedException() throws Exception {
        throw new IOException();
    }

    @Test
    public void testCheckedException() {
        try {
            testThrowCheckedException();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        testThrowUnCheckedException();
    }

}
