package org.zlt.log.config;

import brave.baggage.BaggageFields;
import brave.baggage.CorrelationScopeConfig;
import brave.baggage.CorrelationScopeCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Sleuth 配置类
 *
 * @author zlt
 * @version 1.0
 * @date 2021/9/21
 * <p>
 * Blog: https://zlt2000.gitee.io
 * Github: https://github.com/zlt2000
 */
@Configuration
public class SleuthConfiguration {
    @Bean
    public CorrelationScopeCustomizer createCorrelationScopeCustomizer(){
        return builder -> builder.add(CorrelationScopeConfig.SingleCorrelationField.create(BaggageFields.PARENT_ID));
    }
}
