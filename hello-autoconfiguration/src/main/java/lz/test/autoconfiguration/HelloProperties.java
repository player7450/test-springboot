package lz.test.autoconfiguration;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author 万二(Zheng Liu)
 * @date 2018/02/24
 */
@ConfigurationProperties(prefix = "lz.test.hello")
public class HelloProperties {

    private String helloMsg;

    public String getHelloMsg() {
        return helloMsg;
    }

    public void setHelloMsg(String helloMsg) {
        this.helloMsg = helloMsg;
    }
}
