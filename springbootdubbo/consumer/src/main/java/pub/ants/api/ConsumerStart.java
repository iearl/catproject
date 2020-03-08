package pub.ants.api;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Component;

/**
 * @author magw
 * @version 1.0
 * @date 2020/3/8 上午9:41
 * @description: No Description
 */
@Component
public class ConsumerStart {

    @Reference(url = "dubbo://localhost:20880")
    private Service service;

    public void sendMsg(String message){
        System.out.println(service.sendMessage(message));
    }
}
