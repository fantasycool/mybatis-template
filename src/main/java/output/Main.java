package output;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;
import org.springframework.scheduling.annotation.EnableScheduling;
import output.mapper.UserMapper;

/**
 * Created by frio on 2017/8/1.
 */
@Configuration
@ComponentScan("output")
@ImportResource({"classpath:spring-config.xml"})
@EnableScheduling
public class Main {
    public static void main(String[] args) throws InterruptedException {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Main.class);
        UserMapper userMapper = applicationContext.getBean(UserMapper.class);
        Thread.sleep(1000);
        userMapper.selectByPrimaryKey(9);
        System.out.println();
    }
}
