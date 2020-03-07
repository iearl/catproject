package pub.ants.api;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @author magw
 * @version 1.0
 * @date 2020/3/7 下午11:20
 * @description: 消费者启动类
 */
public class ProviderClient {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext ctx=  new ClassPathXmlApplicationContext("provider.xml");
        ctx.start();
        //阻塞程序
        System.in.read();
    }
}
