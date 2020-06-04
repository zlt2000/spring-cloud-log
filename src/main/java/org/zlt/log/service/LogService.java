package org.zlt.log.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * @author zlt
 * @date 2020/5/31
 * <p>
 * Blog: https://zlt2000.gitee.io
 * Github: https://github.com/zlt2000
 */
@Slf4j
@Service
public class LogService {
    /**
     * 异步方法
     */
    @Async
    public void testAsync() {
        log.info("=========testAsync");
        if (true) {
            throw new RuntimeException("test Exception");
        }
    }

    /**
     * 同步方法，抛异常信息
     */
    public void testSync() {
        log.info("=========testSync");
    }
}
