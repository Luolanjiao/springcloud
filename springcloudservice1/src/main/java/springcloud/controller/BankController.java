package springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springcloud.service.api.BankFeignService;

/**
 * @author luolanjiao
 * @date 2021/4/9
 */
@RestController
@RequestMapping("/bank")
public class BankController {
    @Autowired
    BankFeignService bankFeignService;

    @GetMapping("/test")
    public void test(){
        String test2 = bankFeignService.test();
        System.out.println("调用Feign服务："+test2);
        System.out.println("text");
    }
}
