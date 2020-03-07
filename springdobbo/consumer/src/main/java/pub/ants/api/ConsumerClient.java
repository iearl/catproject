package pub.ants.api;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @author magw
 * @version 1.0
 * @date 2020/3/7 下午11:20
 * @description: 消费者启动类
 */
public class ConsumerClient {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext ctx=  new ClassPathXmlApplicationContext("consumer.xml");
        ctx.start();
        Service service = (Service)ctx.getBean("service"); // 获取远程服务代理
        String msg = service.sendMessage("hello dubbo");
        System.out.println(msg);

    }
}
