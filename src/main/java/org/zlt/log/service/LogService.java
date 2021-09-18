package org.zlt.log.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * @author zlt
 * @date 2020/5/31
 * <p>
 * Blog: https://zlt2000.gitee.io
 * Github: https://github.com/zlt2000
 */
@Service
public class LogService {
    private final static Logger log = LoggerFactory.getLogger(LogService.class);

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
