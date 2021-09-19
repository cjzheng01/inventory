package org.cjzheng01.inventory.prop;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "app.lettuce")
public class LettuceProp {

    private String ip;

    private int port;

    public String getIp() {
        return ip;
    }

    public LettuceProp setIp(String ip) {
        this.ip = ip;
        return this;
    }

    public int getPort() {
        return port;
    }

    public LettuceProp setPort(int port) {
        this.port = port;
        return this;
    }
}
