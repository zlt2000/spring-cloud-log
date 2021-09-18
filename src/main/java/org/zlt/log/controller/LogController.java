package org.zlt.log.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.zlt.log.service.LogService;

/**
 * @author zlt
 * @date 2020/5/31
 * <p>
 * Blog: https://zlt2000.gitee.io
 * Github: https://github.com/zlt2000
 */
@RestController
public class LogController {
    private final static Logger log = LoggerFactory.getLogger(LogController.class);

    @Autowired
    private LogService logService;

    @GetMapping("/logger")
    public String logger() {
        log.info("=============controller-logger-start");

        logService.testAsync();
        logService.testSync();

        log.info("=============controller-logger-end");
        return "logger";
    }
}
