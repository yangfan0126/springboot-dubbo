package com.yangfan.dubbo.provider.payprovider.service;

import com.yangfan.dubbo.IPayService;
import org.apache.dubbo.config.annotation.Service;

/**
 * @Package: com.yangfan.dubbo.provider.payprovider.service <br>
 * @Author: Administrator <br>
 * @Description:TODO <br>
 * @Date: 2020/03/08 14:35 <br>
 * @Copyright: 杭州宠缘品牌发展有限公司 <br>
 * @Version: V1.0
 */
@Service
public class PayServiceImpl implements IPayService {
    @Override
    public String pay(String info) {
        return "dubbo payservice:"+info;
    }
}
