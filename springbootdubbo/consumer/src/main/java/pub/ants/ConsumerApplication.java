package pub.ants;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import pub.ants.api.ConsumerStart;

import java.io.IOException;

/**
 * @author magw
 * @version 1.0
 * @date 2020/3/8 上午9:35
 * @description: @EnableDubboConfiguration 开启dubbo配置
 */
@SpringBootApplication
@EnableDubboConfiguration
public class ConsumerApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(ConsumerApplication.class, args);
        ConsumerStart consumer = run.getBean(ConsumerStart.class);
        consumer.sendMsg("hello world");

    }
}
