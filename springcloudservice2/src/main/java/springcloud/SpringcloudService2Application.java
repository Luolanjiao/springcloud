package springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author luolanjiao
 * @date 2021/4/9
 */
@SpringBootApplication
@EnableEurekaClient
public class SpringcloudService2Application {
    public static void main(String[] args) {
        SpringApplication.run(SpringcloudService2Application.class,args);
    }
}
