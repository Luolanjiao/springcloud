package springcloud.service.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 外部接口
 * @author luolanjiao
 * @date 2021/4/9
 */
@FeignClient(value = "s2")
@Component
public interface BankFeignService {
    @RequestMapping(method = RequestMethod.GET,value = "/bank/test")
    String test();
}
