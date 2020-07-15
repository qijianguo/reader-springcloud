package com.qijianguo.rule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RetryRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author qijianguo
 * 注意： 自定义LB算法不能在ComponentScan扫描的包及子包下
 */
@Configuration
public class CustomerRibbonRule {

    @Bean
    public IRule getRule() {
        // return new RandomRule();
        // 先RoundRobinRule，如果服务异常，尝试maxRetryMillis=500L之内也会重复轮询，尽管会异常
        // return new RetryRule();
        return new CustomerRandomRule();
    }
}
