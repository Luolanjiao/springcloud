package springcloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author luolanjiao
 * @date 2021/4/9
 */
@RestController
@RequestMapping("/bank")
public class BankController {

    @GetMapping("/test")
    public String test(){
        System.out.println("service2 test");
        return "test2";
    }
}
