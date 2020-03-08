package pub.ants.api.impl;


import org.springframework.stereotype.Component;
import pub.ants.api.Service;

/**
 * @author magw
 * @version 1.0
 * @date 2020/3/7 下午11:14
 * @description: No Description
 */
@Component
@com.alibaba.dubbo.config.annotation.Service(interfaceClass = Service.class)
public class ServiceImpl implements Service {
    @Override
    public String sendMessage(String message) {
        return "provider-springboot-message=" + message;
    }
}
