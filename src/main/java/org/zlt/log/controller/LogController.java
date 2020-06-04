package org.zlt.log.controller;

import lombok.extern.slf4j.Slf4j;
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
@Slf4j
@RestController
public class LogController {
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
