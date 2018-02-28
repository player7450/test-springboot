package lz.test.autoconfiguration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * @author 万二(Zheng Liu)
 * @date 2018/02/24
 */
@Configuration
@EnableConfigurationProperties(HelloProperties.class)
public class HelloAutoConfiguration {

    @Autowired
    private HelloProperties helloProperties;

    @Bean(name = "helloMsg")
    @ConditionalOnMissingBean
    public String helloMsg() {
        return helloProperties.getHelloMsg() == null ?
                "hi" : helloProperties.getHelloMsg();
    }

}
