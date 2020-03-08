package com.yangfan.dubbo.payclient;

import com.yangfan.dubbo.IPayService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Package: com.yangfan.dubbo.payclient <br>
 * @Author: Administrator <br>
 * @Description:TODO <br>
 * @Date: 2020/03/08 14:42 <br>
 * @Copyright: 杭州宠缘品牌发展有限公司 <br>
 * @Version: V1.0
 */
@RestController
public class PayController {

    @Reference
    IPayService iPayService;

    @GetMapping("/pay")
    public String pay(){
        return iPayService.pay("client");
    }
}
